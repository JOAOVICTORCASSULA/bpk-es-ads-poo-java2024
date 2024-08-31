import java.util.Scanner;
public class TesteLoja {
    private String nome;
    private String endereco;
    private long telefone;

    public TesteLoja(String nome, String endereco, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(long telefone) {
        if (telefone > 0) {
                this.telefone = telefone
        };
        else {
            System.out.println("Erro: telefone inválido");
        }
    }

    @Override
    public String toString() {
        return "TesteLoja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Abrir loja\n2.Sair.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Abrindo loja...!");
            System.out.println("2.Fechar loja");
            int optionDesligar = scanner.nextInt();
            if (optionDesligar == 2) {
                System.out.println("Fechando loja...");
            }
        }

    }
}