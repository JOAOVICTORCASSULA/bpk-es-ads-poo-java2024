package CARRO;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carModel;
    private Engine engine;

    private static List<Car> carList = new ArrayList<>();

    // Construtor da classe Car
    public Car(String carModel, Engine engine) {
        setCarModel(carModel);
        this.engine = engine;
        carList.add(this);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        if (carModel == null || carModel.isEmpty()) {
            throw new IllegalArgumentException("Erro: Modelo do carro vazio");
        }
        this.carModel = carModel;
    }

    public void powerCar() {
        engine.powerOn();
    }

    public void turnOff() {
        engine.hangUp();
    }

    public void turboBoost() {
        engine.increasePower(50);
    }

    public void reducePowerMotor() {
        engine.reducePower(30);
    }

    public void activateBrake() {
        engine.accelerate(500);
    }

    public void activateAccelerator() {
        engine.reduce(500);
    }

    public static void listCars() {
        int index = 1;
        for (Car car : carList) {
            System.out.println("Carro " + index + ": " + car.toString());
            index++;
        }
    }

    @Override
    public String toString() {
        return carModel + ", Motor: " + engine.getEngineModel() + ", Tipo de Combustível: " + engine.getFuelType();
    }

}
