import java.util.Scanner;
public class TesteVeiculo {
    private String tipo;
    private String placa;
    private String cor;

    public TesteVeiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
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

    void function() {
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
