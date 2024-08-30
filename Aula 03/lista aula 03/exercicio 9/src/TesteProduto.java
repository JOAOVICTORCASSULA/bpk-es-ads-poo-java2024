import java.util.Scanner;
public class TesteProduto {
    public String nome;
    public double preco;
    public long quantidadeEstoque;

    public TesteProduto(String nome, double preco, long quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "TesteProduto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

    void Estoque() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Adicionar estoque\n2.Retirar do estoque");
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("Quantia a ser adicionada: ");
            double i = scanner.nextDouble();
            System.out.println(i + quantidadeEstoque);
        } else if (option == 2) {
            System.out.println("Quantia a ser retirada: ");
            double j = scanner.nextDouble();
            if (quantidadeEstoque > 0 && quantidadeEstoque > j){
                System.out.println(quantidadeEstoque - j);
            }
            else {
                System.out.println("Estoque Insuficiente");
            }
        }

    }
}
