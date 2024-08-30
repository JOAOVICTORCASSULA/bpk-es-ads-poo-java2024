public class Main {
    public static void main(String[] args) {
        TesteLoja testeLoja = new TesteLoja("Americanas", "Avenida blabla numero 45", 4411223344L);
        System.out.println(testeLoja.toString());
        testeLoja.Function();
    }
}