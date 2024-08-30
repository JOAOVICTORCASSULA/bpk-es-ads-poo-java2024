import java.util.Scanner;
public class TesteContaBancaria {
    public int numeroDaConta;
    public double saldo;

    public TesteContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TesteContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }

    void Function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Depositar\n2.Sacar");
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("Quantia a ser depositada: ");
            double i = scanner.nextDouble();
            System.out.println(i + saldo);
        } else if (option == 2) {
            System.out.println("Quantia a ser sacada: ");
            double j = scanner.nextDouble();
            if (saldo > 0 && saldo > j){
                System.out.println(saldo - j);
            }
            else {
                System.out.println("Saldo Insuficiente");
            }
        }
    }
}
