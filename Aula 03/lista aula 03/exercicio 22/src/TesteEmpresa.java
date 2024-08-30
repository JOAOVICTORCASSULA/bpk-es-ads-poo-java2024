import java.util.Scanner;
public class TesteEmpresa {
    public String nome;
    public String CNPJ;
    public int numeroFuncionarios;

    public TesteEmpresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }

    void gerenciarFuncionarios() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Contratar\n2.Demitir\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                contratarFuncionario();
            } else if (option == 2) {
                demitirFuncionario();
            } else if (option == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Erro: opção inválida");
            }
        }
        scanner.close();
    }

    private void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Funcionario contratado. Total de funcionários: " + numeroFuncionarios);
    }

    private void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Funcionario demitido. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Nenhum funcionário para demitir.");
        }
    }
}
