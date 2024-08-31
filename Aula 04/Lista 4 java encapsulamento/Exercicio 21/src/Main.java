public class Main {
    public static void main(String[] args) {
        TesteCozinha testeCozinha = new TesteCozinha("Cozinha aberta e integrada", 18, "azul");
        System.out.println(testeCozinha.toString());
        testeCozinha.Function();
    }
}