import java.util.Scanner;
public class TesteProduto {
    private String nome;
    private double preco;
    private long quantidadeEstoque;

    public TesteProduto(String nome, double preco, long quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Erro: preco inválido");
        }
    }

    public void setQuantidadeEstoque(long quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
        else {
            System.out.println("Erro: estoque inválido");
        }
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
