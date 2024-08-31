// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de TesteBook
        TesteBook testeBook = new TesteBook("A Brief History of Humankind", "Yuval Noah Harari", 443);

        // Exibindo as informações do livro
        System.out.println(testeBook.toString());

        // Chamando a função BookFunction para interagir com o livro
        testeBook.BookFunction();
    }
}
