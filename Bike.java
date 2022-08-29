package oops;

public abstract class Bike {
    abstract void run();

    public static void main(String[] args) {
        Mazda m1=new Mazda();
        m1.run();
    }
}
class Mazda extends Bike{
    //Overrides the run() method
    void run(){
        System.out.println("The Mazda moves perfectly");
    }
}
