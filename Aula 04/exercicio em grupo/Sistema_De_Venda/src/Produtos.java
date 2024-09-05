public class Produtos {
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produtos(String codigo, String descricao, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void consultarInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("Preço alterado para: " + preco);
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public void verificarEstoque(int quantidade) {
        if (verificarDisponibilidade(quantidade)) {
            System.out.println("Quantidade disponível: " + quantidadeEstoque);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    private boolean verificarDisponibilidade(int quantidade) {
        return quantidadeEstoque >= quantidade;
    }

    private double aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("Percentual de desconto inválido.");
            return preco;
        }
        double valorDesconto = preco * (percentualDesconto / 100);
        return preco - valorDesconto;
    }
}
