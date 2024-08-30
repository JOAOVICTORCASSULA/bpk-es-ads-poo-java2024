import java.util.Scanner;
public class TesteComputador {
    public String processador;
    public int memoriaRam;
    public double armazenamento;

    public TesteComputador(String processador, int memoriaRam, double armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "TesteComputador{" +
                "processador='" + processador + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", armazenamento=" + armazenamento +
                '}';
    }

    void LigarDeligar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Ligar Computador\n2.Sair.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Ligando computador...!");
            System.out.println("2.Desligar computador");
            int optionDesligar = scanner.nextInt();
            if (optionDesligar == 2) {
                System.out.println("Desligando computador...");
            }
        }
    }
}