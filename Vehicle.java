package oops;

public class Vehicle {
    public static void main(String[]args){
        Car car=new Car();
        Boat boat=new Boat();
        Bicycle bicycle=new Bicycle();

        Vehicle[] racers={car,boat,bicycle};//Data type to store car,boat,bicycle
        //Loop iterates through all the elements of the array
        for(Vehicle vehicle1 : racers){
            vehicle1.run();
        }
    }

    public void run() {
    }


}
class Boat extends Vehicle{
    public void run(){
        System.out.println("The boat begins moving");
    }
}
class Car extends Vehicle{
   public void run(){
        System.out.println("The car begins moving");
    }
}
class Bicycle extends Vehicle{
    public void run(){
        System.out.println("The bicycle begins moving");
    }
}
