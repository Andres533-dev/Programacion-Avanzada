package Ejercicio4.Control;
import Ejercicio4.View.BufferView;
import Ejercicio4.Model.Buffer;
import java.io.*;

public class BufferControl {

    private BufferView view;
    private Buffer buffer;
    private BufferedWriter bw;
    private Boolean bufferEmpty;

    public BufferControl() throws IOException {
        bufferEmpty = true;
        view = new BufferView(this);
        view.requestBuffer();
    }

    public void createBuffer(int sizeBuffer,String text) throws IOException {
        buffer = new Buffer(sizeBuffer,text);

        // SOLO el writer puede mantenerse compartido si está sincronizado
        bw = new BufferedWriter(new FileWriter("src/Archivo.txt", true), buffer.getSizeBuffer());
    }

    public synchronized void readBuffer() throws IOException {
        System.out.println("Este hilo accedio a readBuffer:"+Thread.currentThread().getName());
        while(bufferEmpty) {
            try {
                System.out.println("Waiting for writer...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        //  Cada hilo crea su propio BufferedReader
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/Archivo.txt"),
                buffer.getSizeBuffer())) {

            String line;
            while((line = br.readLine()) != null) {
                view.showFile(line);
            }
        }

        notifyAll();
    }

    public synchronized void writeBuffer() throws IOException {

        bw.write(buffer.getText());
        bw.newLine();
        bw.flush();

        bufferEmpty = false;
        notifyAll(); // IMPORTANTE despertar lectores
    }
}