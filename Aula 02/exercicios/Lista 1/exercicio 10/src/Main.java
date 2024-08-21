import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            System.out.println("Não é primo");
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}