import java.util.Scanner;
public class TesteBook {
    public String bookTitle;
    public String authorBook;
    public int numberPages;

    public TesteBook(String bookTitle, String authorBook, int numberPages) {
        this.bookTitle = bookTitle;
        this.authorBook = authorBook;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "TesteBook{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }

    void BookFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Abrir livro\n2.Fechar livro");
        int option = scanner.nextInt();
        if (option == 1) {
            int i = 1;
            System.out.println("Livro aberto!");
            while (true) {
                System.out.println("1.Passar pagina\n2.sair");
                int choice = scanner.nextInt();
                if (i < numberPages) {
                    switch (choice) {
                        case 1: System.out.println("Lendo pagina: " + i); i++; break;
                        case 2: System.out.println("Saindo..."); return;
                        default: System.out.println("Erro: número invalido.");
                    }
                }
            }
        }else if (numberPages == -1) {
            System.out.println("Erro: paginas invalidas.");
        }else if (option == 2) {
            System.out.println("Fechando livro...");
        }
    }
}
