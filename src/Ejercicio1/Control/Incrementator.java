package Ejercicio1.Control;

public class Incrementator extends Thread {
    private ControllerNumber controlNum;
    public Incrementator(ControllerNumber controlNum){
        this.controlNum=controlNum;
    }
    public void run(){
        controlNum.incrementNumber();
        System.out.println("Numero aumentado por incrementator1:");
        controlNum.showNumber();

    }

}
