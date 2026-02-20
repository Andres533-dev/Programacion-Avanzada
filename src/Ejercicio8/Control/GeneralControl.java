package Ejercicio8.Control;

public class GeneralControl {
    public GeneralControl() {
        PrinterControl printerControl = new PrinterControl();
        User1 user1=new User1(printerControl);
        User2 user2=new User2(printerControl);
        user1.start();
        user2.start();
    }
}
