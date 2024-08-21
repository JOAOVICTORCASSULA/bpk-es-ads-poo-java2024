import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número inteiro: ");
        double number = scanner.nextDouble();
        if (number % 3 == 0) {
            System.out.println(number + " é um número ímpar.");
        } else {
            System.out.println(number + " é um número par.");
        }
    }
}