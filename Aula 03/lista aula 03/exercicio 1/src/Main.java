public class Main {
    public static void main(String[] args) {
        TesteBook testeBook = new TesteBook("A Brief History of Humankind", "Yuval Noah Harari", 443);
        System.out.println(testeBook.toString());
        testeBook.BookFunction();
    }
}