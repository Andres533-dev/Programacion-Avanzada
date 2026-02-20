package Ejercicio4.Control;

import java.io.IOException;

public class Reader extends Thread{
    private BufferControl buffer;
    public Reader(BufferControl buffer) {
        this.buffer = buffer;
    }
    public void run(){
        try {
            System.out.println("Consumer thread started...");
            Thread.sleep(1000);
            buffer.readBuffer();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
