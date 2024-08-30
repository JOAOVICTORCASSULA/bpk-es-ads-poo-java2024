import java.util.Scanner;
public class TesteCidade {
    public String nome;
    public long populacao;
    public String estado;

    public TesteCidade(String nome, long populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
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
