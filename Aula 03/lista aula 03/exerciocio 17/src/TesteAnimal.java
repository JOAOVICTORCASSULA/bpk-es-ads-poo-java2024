import java.util.Scanner;
public class TesteAnimal {
    public String especie;
    public int idade;
    public double peso;

    public TesteAnimal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "TesteAnimal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Comer\n2.Dormir\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Comendo...");
                System.out.println("1.Parar de comer");
                int option2 = scanner.nextInt();
                scanner.nextLine();

                if (option2 == 1) {
                    System.out.println("Parando de comer...");
                }
                else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 2) {
                System.out.println("Dormindo");
                System.out.println("1.Parar de dormirr");
                int option3 = scanner.nextInt();
                scanner.nextLine();
                if (option3 == 1) {
                    System.out.println("Parando de dormir...");
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
