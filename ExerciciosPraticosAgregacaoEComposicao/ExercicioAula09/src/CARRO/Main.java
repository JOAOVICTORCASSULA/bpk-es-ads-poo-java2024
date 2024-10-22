package CARRO;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(5000, "V8", FuelType.PETROL);
        Engine engine2 = new Engine(4000, "V6", FuelType.DIESEL);
        Engine engine3 = new Engine(0, "Elétrico", FuelType.ELECTRIC);
        Car car1 = new Car("Mustang", engine1);
        Car car2 = new Car("F-150", engine2);
        Car car3 = new Car("Tesla Model S", engine3);
        car1.powerCar();
        car1.turnOff();
        car1.powerCar();
        car1.turboBoost();
        car1.reducePowerMotor();
        car1.activateAccelerator();
        car1.activateBrake();
        Car.listCars();

    }
}
