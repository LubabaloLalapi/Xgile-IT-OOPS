package oops;

public class Car {


    private String make;
    private int year;

    Car(String make,int year){
        this.make=make;
        this.setYear(year);
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setYear(int year){
        this.year=year;
    }

    public static void main(String[]args){
        Car car=new Car("Toyota",2021);
        car.setYear(2022);//Changes/ Sets the year from 2021 to 2022
        System.out.println(car.getMake());//To get the make of the car
        System.out.println(car.getYear());//To get the year of the car
    }


}
