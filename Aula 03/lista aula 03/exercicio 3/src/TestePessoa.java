import java.util.Scanner;
public class TestePessoa {
    public String nome;
    public int idade;
    public double altura;

    public TestePessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void Imprimir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Apresentar pessoa\n2.Fechar");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        } else {
            System.out.println("Saindo...");
        }
    }
}
