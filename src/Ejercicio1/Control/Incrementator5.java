package Ejercicio1.Control;

public class Incrementator5 extends Thread {
    private ControllerNumber controlNum;
    public Incrementator5(ControllerNumber controlNum){
        this.controlNum=controlNum;
    }
    public void run(){
        controlNum.incrementNumber();
        System.out.println("Numero aumentado por incrementator5:");
        controlNum.showNumber();

    }


}