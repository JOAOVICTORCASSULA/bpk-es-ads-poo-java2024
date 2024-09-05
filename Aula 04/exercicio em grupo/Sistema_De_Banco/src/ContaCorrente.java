public class ContaCorrente {
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Número da conta inválido");
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteSaque(double limiteSaque) {
        if (limiteSaque > 0) {
            this.limiteSaque = limiteSaque;
        } else {
            System.out.println("Limite de saque inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso!\n");
        } else {
            System.out.println("\nSaldo insuficiente ou valor inválido.\n");
        }
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nDepósito realizado com sucesso!\n");
        } else {
            System.out.println("\nValor de depósito inválido.\n");
        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (valor <= saldo + limiteSaque) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("\nTransferência realizada com sucesso!\n");
        } else {
            System.out.println("\nSaldo insuficiente.\n");
        }
    }

    public void consultarSaldo() {
        System.out.println("\nConta corrente: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

    private void calcularJuros(double taxaJuros, int tempo) {
        if (taxaJuros > 0 && tempo > 0) {
            double juros = saldo * taxaJuros * tempo;
            saldo += juros;
            System.out.println("\nJuros calculados: " + juros);
            System.out.println("Novo saldo após juros: " + saldo);
        } else {
            System.out.println("Taxa de juros ou tempo inválidos.");
        }
    }

    private void consultarLimite() {
        System.out.println("\nLimite de saque: " + limiteSaque);
    }
}
