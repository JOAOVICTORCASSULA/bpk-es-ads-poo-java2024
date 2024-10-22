package Aula09;

public class PagamentosCredito implements Pagamentos {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento feito com cartão de crédito.");
    }

    @Override
    public String toString() {
        return "Pagamento com cartão de crédito realizado.";
    }
}
