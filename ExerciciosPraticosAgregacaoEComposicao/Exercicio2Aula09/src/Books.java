import java.util.List;
import java.util.ArrayList;

public class Books {
    private String title;
    private String author;
    private Page page;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addPages(int numberOfPages, String contentBook) {
        this.page = new Page(numberOfPages, contentBook);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Page getPage() {
        return page;
    }

    public void showDetails() {
        System.out.println("Titúlo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Número de Pagínas: " + page.getNumPages());
        System.out.println("Contúdo do Livro: " + page.getContent());
    }
}
