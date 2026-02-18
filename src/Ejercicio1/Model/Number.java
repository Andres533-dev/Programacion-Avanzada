package Ejercicio1.Model;


public class Number {
    private int number;
    public Number(int number){
        this.number=number;
    }
    public synchronized int getNumber(){
        return this.number;
    }
    public synchronized void setNumber(int number){
        this.number=number;
    }

}
