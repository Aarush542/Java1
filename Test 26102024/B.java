abstract class Vehicle{
    abstract void start();
    abstract void stop();
}


interface Fuelefficiency {
default void calculateFuelEfficiency(){
    System.out.println("Fuel Efficiency");
}
}

class Car extends Vehicle implements Fuelefficiency{
    void start(){
        System.out.println("Start");
    }
    void stop(){
        System.out.println("Stop");
    }
}
class Bike extends Vehicle implements Fuelefficiency{

    void start(){
        System.out.println("Start");
    }
    void stop(){
        System.out.println("Stop");
    }
} 


public class Main {
    public static void main(String[] args) {
        Car k= new Car();
        Bike k1=new Bike();
        k.start();
        k.stop();
        k.calculateFuelEfficiency();
        k1.start();
        k1.stop();
        k1.calculateFuelEfficiency();
    }
}
