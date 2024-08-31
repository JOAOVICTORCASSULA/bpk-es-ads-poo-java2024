import java.util.Scanner;
public class TestePessoa {
    private String nome;
    private int idade;
    private double altura;

    public TestePessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
        else {
            System.out.println("Erro: altura inválida.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }
        else {
            System.out.println("Erro: altura inválida.");
        }
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
