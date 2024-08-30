import java.util.Scanner;
public class TesteCelular {
    public String marca;
    public String modelo;
    public double bateria;

    public TesteCelular(String marca, String modelo, double bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
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
