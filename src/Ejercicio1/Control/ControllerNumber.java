package Ejercicio1.Control;
import Ejercicio1.Model.Number;
import Ejercicio1.View.ViewNumber;
public class ControllerNumber{
    private Number number;
    private ViewNumber view;
    public ControllerNumber(){
        view=new ViewNumber(this);
        view.requestNumber();
    }
    public void createNumber(int number){
        this.number=new Number(number);
    }
    public synchronized void showNumber(){
        view.showNumber(number.getNumber());
    }
     public synchronized void incrementNumber(){
        int number= this.number.getNumber()+1000;
        this.number.setNumber(number);
    }
}
