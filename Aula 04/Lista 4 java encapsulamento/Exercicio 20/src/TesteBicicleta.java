import java.util.Scanner;
public class TesteBicicleta {
    private String marca;
    private String modelo;
    private int roda;

    public TesteBicicleta(String marca, String modelo, int roda) {
        this.marca = marca;
        this.modelo = modelo;
        this.roda = roda;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getRoda() {
        return roda;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRoda(int roda) {
        if (roda > 0) {
            this.roda = roda;
        }
        else {
            System.out.println("Erro: Tamanho de roda inválido");
        }
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
