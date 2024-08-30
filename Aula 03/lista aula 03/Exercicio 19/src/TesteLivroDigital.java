import java.util.Scanner;
public class TesteLivroDigital {
    public String titulo;
    public String autor;
    public double tamanhoArquivo;

    public TesteLivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return "TesteLivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Abrir livro\n2.Sair.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Abrindo livro...!");
            System.out.println("2.Fechar livro");
            int optionDesligar = scanner.nextInt();
            if (optionDesligar == 2) {
                System.out.println("Fechando livro...");
            }
        }

    }
}
