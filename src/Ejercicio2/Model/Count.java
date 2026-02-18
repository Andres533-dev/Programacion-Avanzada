package Ejercicio2.Model;

public class Count {
        private int count;
        private String name;
        public Count(int countValue, String name){
            this.count =countValue;
            this.name=name;
        }
        public synchronized int getCount(){
            return this.count;
        }
        public synchronized void setCount(int countValue){
            this.count =countValue;
        }
        public synchronized String getName(){
            return this.name;
        }
        public synchronized void setName(String name){
            this.name =name;
        }
}
