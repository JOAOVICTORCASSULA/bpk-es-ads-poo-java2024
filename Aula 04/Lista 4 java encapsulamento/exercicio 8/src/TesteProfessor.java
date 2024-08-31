import java.util.Scanner;
public class TesteProfessor {
    private String nome;
    private String disciplina;
    private double salario;

    public TesteProfessor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
        else {
            System.out.println("Erro: salario invádido");
        }
    }

    @Override
    public String toString() {
        return "TesteProfessor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Dar aula\n2.Corrigir prova\n0.Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Dando aula...");
                System.out.println("1.Parar aula");
                int option2 = scanner.nextInt();
                scanner.nextLine();

                if (option2 == 1) {
                    System.out.println("Parando aula...");
                }
                else {
                    System.out.println("Erro: opção inválida");
                    break;
                }
            } else if (option == 2) {
                System.out.println("Corrigindo prova");
                System.out.println("1.Parar de corrigir");
                int option3 = scanner.nextInt();
                scanner.nextLine();
                if (option3 == 1) {
                    System.out.println("Parando de corrigir...");
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
