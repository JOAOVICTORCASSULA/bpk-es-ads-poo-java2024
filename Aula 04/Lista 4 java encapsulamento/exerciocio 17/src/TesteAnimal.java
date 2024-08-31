import java.util.Scanner;
public class TesteAnimal {
    private String especie;
    private int idade;
    private double peso;

    public TesteAnimal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else {
            System.out.println("Erro: idade inválida");
        }
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
        else {
            System.out.println("Erro: peso inválido");
        }
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
