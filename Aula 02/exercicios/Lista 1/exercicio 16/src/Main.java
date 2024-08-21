import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        double temperaturaConvertida;

        if (escolha == 1) {
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.println(temperatura + "°C é igual a " + temperaturaConvertida + "°F");
        } else if (escolha == 2) {
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F é igual a " + temperaturaConvertida + "°C");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
