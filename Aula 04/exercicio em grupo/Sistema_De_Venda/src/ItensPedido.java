public class ItensPedido {
    private int quantidade;
    private Produtos produto;

    public ItensPedido(int quantidade, Produtos produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produtos getProdutos() {
        return produto;
    }

    public void setProdutos(Produtos produto) {
        this.produto = produto;
    }
}
