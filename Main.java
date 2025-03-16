class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car: " + make + " " + model);
    }

    public void stop() {
        System.out.println("Stopping the car: " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");

        car.start();
        car.stop();
    }
}
