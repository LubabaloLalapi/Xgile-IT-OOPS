package oops;

public class Vehicles {
    double speed;

    public static void go(){
        System.out.println("This vehicle is moving");
    }


    public static void main(String[] args) {
        Cars car=new Cars();
        car.go();
        System.out.println(car.doors);//To get the doors of the car = 4
        System.out.println(car.wheels);////To get the wheels of the car = 4
    }
}

class Cars extends Vehicles{
    int wheels=4;
    int doors=4;

}

