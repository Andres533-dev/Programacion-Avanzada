package Ejercicio8.Control;

import Ejercicio8.Model.Printer;
import Ejercicio8.View.ViewPrinter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrinterControl {
    private BufferedReader br;
    private Printer printer;
    private ViewPrinter viewPrinter;
    public PrinterControl() {
        this.viewPrinter=new ViewPrinter(this);

    }
    public void createPrinter(File file) {
        String path=file.getAbsolutePath();
        printer=new Printer(path);
    }
    public synchronized void print() {
        try (BufferedReader br = new BufferedReader(new FileReader(printer.getFile()),10)) {
            String line;
            while((line = br.readLine()) != null) {
                viewPrinter.printFile(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public synchronized void startPrinter() {
        viewPrinter.requestFile();
    }

}
