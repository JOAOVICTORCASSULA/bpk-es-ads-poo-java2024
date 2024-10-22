package Aula09;

import java.util.ArrayList;
import java.util.List;

public class TestePagamento {
    public static void main(String[] args) {
        List<Pagamentos> listaPagamentos = new ArrayList<>();
        Pagamentos pagamentos = new PagamentosDebito();
        pagamentos.realizarPagamento();
        listaPagamentos.add(pagamentos);

        pagamentos= new PagamentosCredito();
        pagamentos.realizarPagamento();
        listaPagamentos.add(pagamentos);

        System.out.println("Lista de Pagamentos:");
        for (Pagamentos pagamento : listaPagamentos) {
            System.out.println(pagamento);
        }
    }
}

