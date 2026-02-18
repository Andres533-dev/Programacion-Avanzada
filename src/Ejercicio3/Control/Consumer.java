package Ejercicio3.Control;

import java.io.IOException;

public class Consumer extends Thread{
    private BufferControl buffer;
    public Consumer(BufferControl buffer) {
        this.buffer = buffer;
    }
    public void run(){
        try {
            buffer.readBuffer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
