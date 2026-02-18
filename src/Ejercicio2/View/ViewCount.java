package Ejercicio2.View;
import Ejercicio2.Control.ControlCount;

import java.util.Scanner;

public class ViewCount {
    private Scanner input;
    private ControlCount control;
    public ViewCount(ControlCount control){
        this.control=control;
        input=new Scanner(System.in);
    }
    public void requestName(){
        System.out.println("Ingrese su nombre: ");
        String name=input.nextLine();
        control.createCount(name);
    }
    public void showRetire(int retireValue){
        System.out.println("Se retiro un monto de:"+retireValue);
    }
    public void errorRetire(int retireValue){
        System.out.println("Retiro rechazado se intento retirar:"+retireValue+" "+"Pero esto excede el valor en la cuenta");
    }
    public synchronized void showCount(int number,String name){
        System.out.println(name+" "+"su saldo actual es:"+number);
    }
}
