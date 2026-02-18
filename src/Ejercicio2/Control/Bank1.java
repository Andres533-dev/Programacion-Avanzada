package Ejercicio2.Control;

public class Bank1 extends Thread {
    private ControlCount control;
    public Bank1(ControlCount control) {
        this.control = control;
    }
    public void run(){
        System.out.println("Retiro de Bank1:");
        int retireValue=(int)(Math.random()*2000+1);
        control.retireCount(retireValue);
        control.showCount();
    }
}
