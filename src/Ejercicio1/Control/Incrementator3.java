package Ejercicio1.Control;

public class Incrementator3  extends Thread {
    private ControllerNumber controlNum;
    public Incrementator3(ControllerNumber controlNum){
        this.controlNum=controlNum;
    }
    public void run(){
        controlNum.incrementNumber();
        System.out.println("Numero aumentado por incrementator3:");
        controlNum.showNumber();

    }


}