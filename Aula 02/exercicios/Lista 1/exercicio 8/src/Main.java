import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Seu nome: " + name);
        System.out.println("Sua idade: " + age);
    }
}