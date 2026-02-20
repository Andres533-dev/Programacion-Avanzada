package Ejercicio4.Control;

import java.io.IOException;

public class Writer extends Thread {
    private BufferControl buffer;
    public Writer(BufferControl buffer) {
        this.buffer=buffer;
    }
    public void run() {
        System.out.println("Producer thread started...");
        try {
            buffer.writeBuffer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
