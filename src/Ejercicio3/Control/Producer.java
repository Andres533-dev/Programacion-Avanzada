package Ejercicio3.Control;

import java.io.IOException;

public class Producer extends Thread {
    private BufferControl buffer;
    public Producer(BufferControl buffer) {
        this.buffer=buffer;
    }
    public void run() {
        try {
            buffer.writeBuffer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
