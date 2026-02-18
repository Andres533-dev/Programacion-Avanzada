package Ejercicio2.Control;

public class Bank3 extends Thread {
    private ControlCount control;
    public Bank3(ControlCount control) {
        this.control = control;
    }
    public void run(){
        System.out.println("Retiro de Bank3:");
        int retireValue=(int)(Math.random()*3000+1);
        control.retireCount(retireValue);
        control.showCount();
    }
}