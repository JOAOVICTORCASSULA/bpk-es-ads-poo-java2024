import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Clientes cliente;
    private List<ItensPedido> itens;

    public Pedido(int numeroPedido, Clientes cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItensPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItensPedido item) {
        itens.add(item);
    }

    public void removerItem(ItensPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItensPedido item : itens) {
            total += item.getProdutos().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void disponibilidadeItens() {
        for (ItensPedido item : itens) {
            Produtos produto = item.getProdutos();
            if (item.getQuantidade() > produto.getQuantidadeEstoque()) {
                System.out.println("Item " + produto.getCodigo() + " não está disponível na quantidade desejada.");
            } else {
                System.out.println("Item " + produto.getCodigo() + " disponível.");
            }
        }
    }
}