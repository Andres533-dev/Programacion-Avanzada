package Ejercicio3.Control;


import java.io.Console;
import java.io.IOException;

public class GeneralController {
    private BufferControl buffer;
    private Consumer1 consumer1;
    private Consumer2 consumer2;
    private Producer1 producer1;
    private Producer2 producer2;
    public GeneralController() throws IOException {
        buffer=new BufferControl();
        producer1=new Producer1(buffer);
        producer2=new Producer2(buffer);
        consumer1=new Consumer1(buffer);
        consumer2=new Consumer2(buffer);
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();

    }
}
