// TesteBook.java
import java.util.Scanner;

public class TesteBook {
    // Atributos privados para encapsulamento
    private String bookTitle;
    private String authorBook;
    private int numberPages;

    // Construtor da classe para inicializar os atributos
    public TesteBook(String bookTitle, String authorBook, int numberPages) {
        this.bookTitle = bookTitle;
        this.authorBook = authorBook;
        this.numberPages = numberPages;
    }

    // Getter para o título do livro
    public String getBookTitle() {
        return bookTitle;
    }

    // Setter para o título do livro
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Getter para o autor do livro
    public String getAuthorBook() {
        return authorBook;
    }

    // Setter para o autor do livro
    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    // Getter para o número de páginas
    public int getNumberPages() {
        return numberPages;
    }

    // Setter para o número de páginas
    public void setNumberPages(int numberPages) {
        if (numberPages > 0) {  // Validação simples para garantir que o número de páginas seja positivo
            this.numberPages = numberPages;
        } else {
            System.out.println("Erro: número de páginas inválido.");
        }
    }

    // Sobrescrevendo o método toString para exibir as informações do livro
    @Override
    public String toString() {
        return "TesteBook{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }

    // Método para interagir com o livro
    void BookFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Abrir livro\n2.Fechar livro");
        int option = scanner.nextInt();

        if (option == 1) {
            int i = 1;
            System.out.println("Livro aberto!");
            while (true) {
                System.out.println("1.Passar página\n2.Sair");
                int choice = scanner.nextInt();

                if (i < numberPages) {
                    switch (choice) {
                        case 1:
                            System.out.println("Lendo página: " + i);
                            i++;
                            break;
                        case 2:
                            System.out.println("Saindo...");
                            return;
                        default:
                            System.out.println("Erro: número inválido.");
                    }
                } else {
                    System.out.println("Você chegou ao final do livro.");
                    break;
                }
            }
        } else if (option == 2) {
            System.out.println("Fechando livro...");
        } else {
            System.out.println("Erro: opção inválida.");
        }
    }
}

