package Ejercicio5.Control;


public class GeneralController {
    public GeneralController() throws InterruptedException {
        ControllerNumber controlNum=new ControllerNumber();
        Incrementator1 in1=new Incrementator1(controlNum);
        Incrementator2 in2=new Incrementator2(controlNum);
        Incrementator3 in3=new Incrementator3(controlNum);
        Incrementator4 in4=new Incrementator4(controlNum);
        Incrementator5 in5=new Incrementator5(controlNum);
        in1.start();
        Thread.sleep(2000);
        in2.start();
        Thread.sleep(2000);
        in3.start();
        Thread.sleep(2000);
        in4.start();
        Thread.sleep(2000);
        in5.start();
        Thread.sleep(2000);
    }


}