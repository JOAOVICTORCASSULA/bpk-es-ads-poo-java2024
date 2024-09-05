public class Main {
    public static void main(String[] args) {
        // criar algumas contas correntes
        ContaCorrente conta1 = new ContaCorrente(12345, "João Silva", 5000.00, 1000.00);
        ContaCorrente conta2 = new ContaCorrente(67890, "Maria Oliveira", 3000.00, 500.00);

        // criar um cliente e adicionar contas
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);

        // consultar
        cliente.consultarContas();

        // realizar operações
        conta1.depositar(500.00);
        conta1.sacar(1000.00);
        conta1.transferir(2000.00, conta2);

        // consultar saldo e limite
        conta1.consultarSaldo();
        conta2.consultarSaldo();
        cliente.consultarContas();
    }
}
