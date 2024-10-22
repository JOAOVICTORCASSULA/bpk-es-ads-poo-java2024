package Aula09;

public class PagamentosDebito implements Pagamentos {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento feito via PIX.");
    }

    @Override
    public String toString() {
        return "PIX feito.";
    }
}
