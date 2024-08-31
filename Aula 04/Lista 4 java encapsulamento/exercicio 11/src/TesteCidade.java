import java.util.Scanner;
public class TesteCidade {
    private String nome;
    private long populacao;
    private String estado;

    public TesteCidade(String nome, long populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(long populacao) {
        if (populacao > 0) {
            this.populacao = populacao;
        } else {
            System.out.println("Erro: população inválida");
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TesteCidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Aumentar população\n2.Diminuir população");
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("Quantia de habitantes a ser adicionada: ");
            double i = scanner.nextLong();
            System.out.println(i + populacao);
        } else if (option == 2) {
            System.out.println("Quantia de habitantes a ser retirado: ");
            double j = scanner.nextLong();
            if (populacao > 0 && populacao > j){
                System.out.println(populacao - j);
            }
            else {
                System.out.println("Saldo Insuficiente");
            }
        }

    }
}
