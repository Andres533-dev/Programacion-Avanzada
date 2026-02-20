package Ejercicio5.View;

public class ViewIncrementator {
    public ViewIncrementator(){}
    public void showIncrementator(String Incrementator){
        System.out.println("El incrementador:"+Incrementator+" "+"empezo un proceso nuevo");
    }
    public void showProcess(String incrementator,String process){
        System.out.println("El proceso actual de "+" "+incrementator+" "+"es:"+process);
    }
}
