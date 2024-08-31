import java.util.Scanner;
public class TesteAluno {
    private String nome;
    private long matricula;
    private String curso;

    public TesteAluno(String nome, long matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(long matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
        else {
            System.out.println("Erro: mátricula inválida");
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "TesteAluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    void nota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantia de provas: ");
        int size = scanner.nextInt();
        int[] notas = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < size; i++) {
            soma += notas[i];
        }
        float media = (float) soma / size;
        System.out.printf("Média das notas: %.2f\n", media);
        scanner.close();
    }
}
