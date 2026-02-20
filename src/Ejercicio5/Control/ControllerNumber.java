package Ejercicio5.Control;
import Ejercicio5.Model.Number;
import Ejercicio5.View.ViewIncrementator;
import Ejercicio5.View.ViewNumber;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ControllerNumber{
    private Boolean finished = false;
    private Number number;
    private ViewNumber view;
    private CyclicBarrier barrier;
    private ViewIncrementator incView;
    public ControllerNumber(){
        this.barrier=new CyclicBarrier(5);
        incView=new ViewIncrementator();
        view=new ViewNumber(this);
        view.requestNumber();
    }
    public void createNumber(int number){
        this.number=new Number(number);
    }
    public synchronized void showNumber(){
        if(!finished){
            view.showNumber(number.getNumber());
        }
        finished=true;
    }
     public void incrementNumber() throws BrokenBarrierException, InterruptedException {
        incView.showIncrementator(Thread.currentThread().getName());
         Thread.sleep(2000);
         synchronized (this) {
             int number = this.number.getNumber() + 1000;
             incView.showProcess(Thread.currentThread().getName(),"Sumar 1000 al numero");
             Thread.sleep(2000);
             this.number.setNumber(number);
         }
         incView.showProcess(Thread.currentThread().getName(),"Suma realizada, esperando a los demas incrementadores");
         Thread.sleep(2000);
        barrier.await();
    }
    public void decrementNumber() throws BrokenBarrierException, InterruptedException {
        incView.showIncrementator(Thread.currentThread().getName());
        Thread.sleep(2000);
        synchronized (this) {
            int number = this.number.getNumber() - 500;
            incView.showProcess(Thread.currentThread().getName(),"Restar 500 al numero");
            Thread.sleep(2000);
            this.number.setNumber(number);
        }
        incView.showProcess(Thread.currentThread().getName(),"Resta realizada, esperando a los demas incrementadores");
        Thread.sleep(2000);
        barrier.await();
    }
}
