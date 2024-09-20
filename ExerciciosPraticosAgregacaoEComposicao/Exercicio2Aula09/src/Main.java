public class Main {
    public static void main(String[] args) {
        Books books = new Books("Game of Thones", "João");
        books.addPages(1, "Java");
        books.showDetails();
    }
}