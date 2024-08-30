import java.util.Scanner;
public class TesteBicicleta {
    public String marca;
    public String modelo;
    public int roda;

    public TesteBicicleta(String marca, String modelo, int roda) {
        this.marca = marca;
        this.modelo = modelo;
        this.roda = roda;
    }

    @Override
    public String toString() {
        return "TesteBicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", roda=" + roda +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Pedalar\n2.Sair.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Pedalando...!");
            System.out.println("2.Freiar");
            int optionDesligar = scanner.nextInt();
            if (optionDesligar == 2) {
                System.out.println("Freiando...");
            }
        }

    }
}
