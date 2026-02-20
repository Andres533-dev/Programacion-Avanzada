package Ejercicio5.View;

import Ejercicio5.Control.ControllerNumber;

import java.util.Scanner;

public class ViewNumber {
    private int number;
    private Scanner input;
    private ControllerNumber control;
    public ViewNumber(ControllerNumber control){
        this.control=control;
        input=new Scanner(System.in);
    }
    public void requestNumber(){
        System.out.print("Bienvenido al incrementador, ingrese el numero a incrementar:");
        number=Integer.parseInt(input.nextLine());
        control.createNumber(number);
    }
     public void showNumber(int number){
        System.out.println("Su numero es:"+number);
    }
}

