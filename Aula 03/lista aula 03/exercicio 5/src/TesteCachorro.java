import java.util.Scanner;
public class TesteCachorro {
    public String nome;
    public String raca;
    public int idade;

    public TesteCachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "TesteCachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public void Function() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Latir\n2.Correr\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Latindo...");
                System.out.println("1.Parar de latir");
                int option2 = scanner.nextInt();
                scanner.nextLine();

                if (option2 == 1) {
                    System.out.println("Parando de latir...");
                }
                else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 2) {
                System.out.println("Correndo");
                System.out.println("1.Parar de correr");
                int option3 = scanner.nextInt();
                scanner.nextLine();
                if (option3 == 1) {
                    System.out.println("Parando de correr...");
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
