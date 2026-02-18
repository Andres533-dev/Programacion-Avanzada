package Ejercicio1.Control;


public class GeneralController {
    public GeneralController() throws InterruptedException {
        ControllerNumber controlNum=new ControllerNumber();
        Incrementator1 in1=new Incrementator1(controlNum);
        Incrementator2 in2=new Incrementator2(controlNum);
        Incrementator3 in3=new Incrementator3(controlNum);
        Incrementator4 in4=new Incrementator4(controlNum);
        Incrementator5 in5=new Incrementator5(controlNum);
        in1.start();
        in1.join();
        in2.start();
        in2.join();
        in3.start();
        in3.join();
        in4.start();
        in4.join();
        in5.start();
        in5.join();
    }


}