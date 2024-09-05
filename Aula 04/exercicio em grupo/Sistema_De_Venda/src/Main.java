public class Main {
    public static void main(String[] args) {
        // Criar clientes
        Clientes cliente1 = new Clientes("João Silva", "123.456.789-00");
        Clientes cliente2 = new Clientes("Maria Oliveira", "987.654.321-00");

        // Criar produtos
        Produtos produto1 = new Produtos("P001", "Produto A", 10.0, 100);
        Produtos produto2 = new Produtos("P002", "Produto B", 20.0, 50);

        // Criar itens de pedido
        ItensPedido item1 = new ItensPedido(5, produto1);
        ItensPedido item2 = new ItensPedido(2, produto2);

        // Criar pedidos
        Pedido pedido1 = new Pedido(1001, cliente1);
        Pedido pedido2 = new Pedido(1002, cliente2);

        // Adicionar itens aos pedidos
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        pedido2.adicionarItem(new ItensPedido(3, produto1));

        // Exibir informações dos pedidos
        System.out.println("Pedido 1:");
        System.out.println("Número do Pedido: " + pedido1.getNumeroPedido());
        System.out.println("Cliente: " + pedido1.getCliente().getNome());
        System.out.println("Itens do Pedido:");
        for (ItensPedido item : pedido1.getItens()) {
            System.out.println("- Produto: " + item.getProdutos().getDescricao() + ", Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total do Pedido 1: R$ " + pedido1.calcularTotal());
        pedido1.disponibilidadeItens();

        System.out.println("\nPedido 2:");
        System.out.println("Número do Pedido: " + pedido2.getNumeroPedido());
        System.out.println("Cliente: " + pedido2.getCliente().getNome());
        System.out.println("Itens do Pedido:");
        for (ItensPedido item : pedido2.getItens()) {
            System.out.println("- Produto: " + item.getProdutos().getDescricao() + ", Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total do Pedido 2: R$ " + pedido2.calcularTotal());
        pedido2.disponibilidadeItens();
    }
}
