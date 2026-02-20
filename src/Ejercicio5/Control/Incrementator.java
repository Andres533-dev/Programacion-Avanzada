package Ejercicio5.Control;

import java.util.concurrent.BrokenBarrierException;

public class Incrementator extends Thread {
    private ControllerNumber controlNum;
    public Incrementator(ControllerNumber controlNum){
        this.controlNum=controlNum;
    }
    public void run(){
        try {
            controlNum.incrementNumber();
            controlNum.decrementNumber();
        } catch (BrokenBarrierException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        controlNum.showNumber();
    }
}