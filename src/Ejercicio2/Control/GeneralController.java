package Ejercicio2.Control;

public class GeneralController {
    public GeneralController() throws InterruptedException {
        ControlCount controlCount=new ControlCount();
        Bank1 bank1=new Bank1(controlCount);
        Bank2 bank2=new Bank2(controlCount);
        Bank3 bank3=new Bank3(controlCount);
        bank1.start();
        bank1.join();
        bank2.start();
        bank2.join();
        bank3.start();
        bank3.join();

    }
}
