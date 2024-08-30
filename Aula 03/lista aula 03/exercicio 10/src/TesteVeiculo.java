import java.util.Scanner;
public class TesteVeiculo {
    public String tipo;
    public long placa;
    public String cor;

    public TesteVeiculo(String tipo, long placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "TesteVeiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa=" + placa +
                ", cor='" + cor + '\'' +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Lavar carro\n2.Abastecer\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Lavando carro...");
                System.out.println("1.Parar de lavar");
                int option2 = scanner.nextInt();
                scanner.nextLine();

                if (option2 == 1) {
                    System.out.println("Parando de lavar...");
                }
                else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 2) {
                System.out.println("Abastecendo");
                System.out.println("1.Parar de abastecer");
                int option3 = scanner.nextInt();
                scanner.nextLine();
                if (option3 == 1) {
                    System.out.println("Parando de abastecer...");
                } else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Erro: opção inválida");
            }
        }
        scanner.close();
    }
}
