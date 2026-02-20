package Ejercicio4.View;
import Ejercicio4.Control.BufferControl;

import java.io.IOException;
import java.util.Scanner;

public class BufferView {
    Scanner sc;
    BufferControl control;
    public BufferView(BufferControl control) {
        sc = new Scanner(System.in);
        this.control = control;
    }
    public void requestBuffer() throws IOException {
        System.out.print("Introduzca el tamaño del buffer: ");
        int sizeBuffer = sc.nextInt();
        System.out.print("Ingrese la linea a guardar en el archivo:");
        sc.nextLine();
        String line = sc.nextLine();
        control.createBuffer(sizeBuffer, line);
    }
    public void showFile(String line){
        System.out.println("Se tiene guardado:"+line);

    }
}
