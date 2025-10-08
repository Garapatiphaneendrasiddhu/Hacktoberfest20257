abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void start();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " Car is starting with a key!");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " Bike is starting with a kick!");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        Vehicle bike = new Bike("Yamaha");
        car.start();
        bike.start();
    }
}
