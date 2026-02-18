package Ejercicio3.Control;
import Ejercicio3.View.BufferView;
import Ejercicio3.Model.Buffer;
import java.io.*;

public class BufferControl {
    private BufferView view;
    private Buffer buffer;
    private BufferedWriter bw;
    private BufferedReader br;
    private Boolean bufferEmpty;
    public BufferControl() throws IOException {
        bufferEmpty = true;
        view = new BufferView(this);
        view.requestBuffer();
    }
    public void createBuffer(int sizeBuffer,String text) throws IOException {
        buffer=new Buffer(sizeBuffer,text);
        br=new BufferedReader(new FileReader("src/Archivo.txt"),buffer.getSizeBuffer());
        bw=new BufferedWriter(new FileWriter("src/Archivo.txt",true),buffer.getSizeBuffer());
    }
    public synchronized void readBuffer() throws IOException {
        while(bufferEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        bufferEmpty=true;
        String line;
        while((line = br.readLine())!=null) {
            view.showFile(line);
        }
        notifyAll();


    }
    public synchronized void writeBuffer() throws IOException {
        while(!bufferEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        bufferEmpty=false;
        bw.write(buffer.getText());
        bw.newLine();
        bw.flush();
        notifyAll();
    }


}
