import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numberTwo = scanner.nextDouble();
        double resultMultiplication = numberOne * numberTwo;
        double resultAddition = numberOne + numberTwo;
        double resultDivision = numberOne / numberTwo;
        double resultSubtraction = numberOne - numberTwo;
        System.out.println(resultAddition);
        System.out.println(resultSubtraction);
        System.out.println(resultMultiplication);
        System.out.println(resultDivision);
    }
}