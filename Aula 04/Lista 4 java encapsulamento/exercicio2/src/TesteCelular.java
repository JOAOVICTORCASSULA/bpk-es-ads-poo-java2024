import java.util.Scanner;
public class TesteCelular {
    private String marca;
    private String modelo;
    private double bateria;

    public TesteCelular(String marca, String modelo, double bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getBateria() {
        return bateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(double bateria) {
        if (bateria > 0){
            this.bateria = bateria;
        }
        else {
            System.out.println("Erro: nível de bateria inválido..");
        }
    }

    @Override
    public String toString() {
        return "TesteCelular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                '}';
    }

    void LigarDeligar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Ligar celular\n2.Sair.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Celular ligado...!");
            System.out.println("2.Desligar celular");
            int optionDesligar = scanner.nextInt();
            if (optionDesligar == 2) {
                System.out.println("Desligando celular...");
            }
        }

    }
}
