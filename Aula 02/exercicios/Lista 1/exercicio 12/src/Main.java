import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Números em ordem crescente:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
