public class Main {
    public static void main(String[] args) {
        TesteCelular testeCelular = new TesteCelular("Samsung", "Galaxy S21", 4.000);
        System.out.println(testeCelular.toString());
        testeCelular.LigarDeligar();
    }
}