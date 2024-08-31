import java.util.Scanner;
public class TesteCozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public TesteCozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        if (quantidadePessoas >= 0) {
            this.quantidadePessoas = quantidadePessoas;
        }
        else {
            System.out.println("Erro: quantidade de pessoas inválida");
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "TesteCozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Limpar\n2.Cozinhar\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Limpando...");
                System.out.println("1.Parar de limpar");
                int option2 = scanner.nextInt();
                scanner.nextLine();

                if (option2 == 1) {
                    System.out.println("Parando de limpar...");
                }
                else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 2) {
                System.out.println("cozinhando");
                System.out.println("1.Parar de cozinhar");
                int option3 = scanner.nextInt();
                scanner.nextLine();
                if (option3 == 1) {
                    System.out.println("Parando de cozinhar...");
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
