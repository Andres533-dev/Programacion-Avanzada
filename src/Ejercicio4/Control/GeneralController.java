package Ejercicio4.Control;


import java.io.IOException;

public class GeneralController {
    private BufferControl buffer;
    private Reader1 consumer1;
    private Reader2 consumer2;
    private Writer1 producer1;
    public GeneralController() throws IOException {
        buffer=new BufferControl();
        producer1=new Writer1(buffer);
        consumer1=new Reader1(buffer);
        consumer2=new Reader2(buffer);
        producer1.setPriority(Thread.MAX_PRIORITY);
        producer1.start();
        consumer1.start();
        consumer2.start();

    }
}
