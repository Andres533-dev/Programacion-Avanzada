package Ejercicio8.Control;

public class User extends Thread {
    private PrinterControl printerControl;
    public User(PrinterControl printerControl) {
        this.printerControl=printerControl;
    }
    public void run() {
        this.printerControl.startPrinter();
        this.printerControl.print();
    }
}
