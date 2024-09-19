public class Main {
    public static void main(String[] args) {
        // Cria um cliente
        Customer customer = new Customer("João", "123.456.783-10");
        customer.AddCustomerAddress("Cezar Lattes", "Centro", 41, "85830 000", "Toledo");

        // Cria um pedido com o cliente
        Request request = new Request(456, customer);

        // Inicializa produtos e itens no pedido
        request.initializeProducts(); // Inicializa produtos antes de adicionar itens
        request.initializeItens(); // Inicializa itens depois de produtos

        // Lista os itens e o total do pedido
        request.listItens();
        System.out.println("\n---Preço do Pedido---\n");
        System.out.println("Preço Total: R$" + request.calculateTotal());
    }
}

