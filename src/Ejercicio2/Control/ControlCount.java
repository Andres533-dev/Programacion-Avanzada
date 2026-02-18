package Ejercicio2.Control;

import Ejercicio2.Model.Count;
import Ejercicio2.View.ViewCount;

public class ControlCount {
    private Count count;
    private ViewCount view;{
        view=new ViewCount(this);
        view.requestName();
    }
    public void createCount(String name){
        this.count=new Count(1000,name);
    }
    public synchronized void showCount(){
        view.showCount(count.getCount(),count.getName());
    }
    public synchronized void retireCount(int retireValue){
        if(count.getCount()>=retireValue){
            count.setCount(count.getCount()-retireValue);
            view.showRetire(retireValue);
        }
        else{
            view.errorRetire(retireValue);
        }

    }
}
