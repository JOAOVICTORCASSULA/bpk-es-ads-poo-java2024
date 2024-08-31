import java.util.Scanner;
public class TesteComputador {
    private String processador;
    private int memoriaRam;
    private double armazenamento;

    public TesteComputador(String processador, int memoriaRam, double armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRam(int memoriaRam) {
        if (memoriaRam > 0) {
            this.memoriaRam = memoriaRam;
        }
        else {
            System.out.println("Erro: memória ram inválida");
        }
    }

    public void setArmazenamento(double armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        }
        else {
            System.out.println("Erro: armazenamento inválido");
        }
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