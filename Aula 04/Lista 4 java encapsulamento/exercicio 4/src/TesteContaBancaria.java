import java.util.Scanner;
public class TesteContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public TesteContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if ( numeroDaConta > 0){
            this.numeroDaConta = numeroDaConta;
        } else {
            System.out.println("Erro: conta inválida");
        }
    }

    public void setSaldo(double saldo) {
        if ( saldo > 0){
            this.saldo = saldo;
        } else {
            System.out.println("Erro: saldo negativo");
        }
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
