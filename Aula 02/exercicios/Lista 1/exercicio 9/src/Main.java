import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numberTwo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a operação: ");
        String operation = scanner.nextLine();
        switch (operation) {
            case "+": System.out.println(numberOne+numberTwo); break;
            case "-": System.out.println(numberOne-numberTwo); break;
            case "*": System.out.println(numberOne*numberTwo); break;
            case "/": System.out.println(numberOne/numberTwo); break;
            default: System.out.println("Operação não encontrada."); break;
        }
    }
}