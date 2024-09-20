package CARRO;

public class Engine {
    private int displacement = 0;
    private String engineModel;
    private int rpm = 0;
    private int power = 0;
    private boolean connect;
    private FuelType fuelType;

    public Engine(int displacement, String engineModel, FuelType fuelType) {
        setDisplacement(displacement);
        setEngineModel(engineModel);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        if (displacement < 0) {
            System.out.println("Erro: Cilindradas Vazia");
        }
        this.displacement = displacement;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        if (engineModel == null || engineModel.isEmpty()) {
            throw new IllegalArgumentException("Erro: modelo do motor vazio");
        }
        this.engineModel = engineModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power <= 0) {
            throw new IllegalArgumentException("Erro: Potência vazia");
        }
        this.power = power;
    }

    protected void powerOn() {
        System.out.println("Motor ligando...");
        this.connect = true;
        this.rpm = 1000;
    }

    public boolean isConnect() {
        return connect;
    }

    public int getRpm() {
        return rpm;
    }

    protected void hangUp() {
        System.out.println("Motor desligando...");
        this.connect = false;
        this.rpm = 0;
    }

    protected void increasePower(int increment) {
        this.power += increment;
        System.out.println("Potência aumentada para: " + power);
    }

    protected void reducePower(int decrement) {
        this.power -= decrement;
        System.out.println("Potência reduzida para: " + power);
    }

    protected void accelerate(int incrementRpm) {
        if (connect) {
            this.rpm += incrementRpm;
            System.out.println("Rpm aumentada para: " + rpm);
        } else {
            System.out.println("Erro: Motor desligado");
        }
    }

    protected void reduce(int decrementRpm) {
        if (connect) {
            if (rpm - decrementRpm >= 0) {
                this.rpm -= decrementRpm;
                System.out.println("Rpm diminuída para: " + rpm);
            } else {
                System.out.println("Erro: Rpm muito baixo");
            }
        } else {
            System.out.println("Erro: Motor desligado");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "displacement=" + displacement +
                ", engineModel='" + engineModel + '\'' +
                ", rpm=" + rpm +
                ", power=" + power +
                ", connect=" + connect +
                ", fuelType=" + fuelType +
                '}';
    }
}
