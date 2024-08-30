public class Main {
    public static void main(String[] args) {
        TesteProduto testeProduto = new TesteProduto("Agua ", 3.50, 150);
        System.out.println(testeProduto.toString());
        testeProduto.Estoque();
    }
}