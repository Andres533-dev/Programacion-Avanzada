package Ejercicio1.Control;

public class Incrementator4  extends Thread {
    private ControllerNumber controlNum;
    public Incrementator4(ControllerNumber controlNum){
        this.controlNum=controlNum;
    }
    public void run(){
        controlNum.incrementNumber();
        System.out.println("Numero aumentado por incrementator4:");
        controlNum.showNumber();

    }


}
