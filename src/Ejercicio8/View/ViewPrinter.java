package Ejercicio8.View;

import Ejercicio8.Control.PrinterControl;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ViewPrinter {
        private JFileChooser fc;
        private File f;
        private int number;
        private Scanner input;
        private PrinterControl control;
        public ViewPrinter(PrinterControl control){
            this.control=control;
            input=new Scanner(System.in);
        }
        public void requestFile(){
            System.out.print("Bienvenido a la impresora,elija el archivo a imprimir");
            fc=new JFileChooser(System.getProperty("user.dir"));
            fc.showOpenDialog(fc);
            f=fc.getSelectedFile();
            control.createPrinter(f);
        }
        public synchronized void printFile(String text){
            System.out.println(text);
        }
}
