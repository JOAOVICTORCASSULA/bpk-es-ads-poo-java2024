import java.util.List;
import java.util.ArrayList;

public class Request {
    // Atributos para armazenar o ID do pedido, itens do pedido, produtos e cliente
    private int idRequest;
    private List<Item> itens;
    private List<Product> products;
    private Customer customer;

    // Construtor da classe, inicializa os atributos com os valores fornecidos
    public Request(int idRequest, Customer customer) {
        setIdRequest(idRequest);
        this.itens = new ArrayList<>();
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    // Inicializa a lista de produtos com alguns produtos de exemplo
    public void initializeProducts() {
        this.products.add(new Product("Produto 1", 1, 10.0, 100));
        this.products.add(new Product("Produto 2", 2, 15.0, 200));
        this.products.add(new Product("Produto 3", 3, 25.0, 300));
    }

    // Inicializa a lista de itens com itens que referenciam os produtos já inicializados
    public void initializeItens() {
        // IDs dos produtos corrigidos para corresponder aos IDs dos produtos inicializados
        this.addItem(1, 1); // ID 1 corresponde ao Produto 1
        this.addItem(2, 2); // ID 2 corresponde ao Produto 2
        this.addItem(3, 3); // ID 3 corresponde ao Produto 3
    }

    // Getter para o ID do pedido
    public int getIdRequest() {
        return idRequest;
    }

    // Setter para o ID do pedido, com validação para garantir que o valor seja maior que 0
    public void setIdRequest(int idRequest) {
        if (idRequest <= 0) {
            System.out.println("Erro: Id do pedido inválido");
        }
        this.idRequest = idRequest;
    }

    // Adiciona um item à lista de itens do pedido
    public void addItem(int itemQuantity, int productId) {
        Item item = new Item(productId, itemQuantity); // Corrigido para que o ID corresponda
        itens.add(item);
    }

    // Lista todos os itens do pedido e as informações do cliente
    public void listItens() {
        System.out.println("\n---Informações do Pedido---\n");
        System.out.println("Pedido número: " + idRequest);
        for (Item item : itens) {
            Product product = findProductById(item.getProductId());
            if (product != null) {
                System.out.println("\nProduto: " + product.getProductName());
                System.out.println("Quantidade: " + item.getItemQuantity());
                System.out.println("Preço Unitário: " + product.getProductValue());
            } else {
                System.out.println("Produto com ID " + item.getProductId() + " não encontrado.");
            }
        }

        if (customer != null) {
            customer.listAddresses();
        } else {
            System.out.println("Cliente não definido.");
        }
    }

    // Encontra um produto pelo seu ID
    private Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getNumProduct() == productId) {
                return product;
            }
        }
        return null;
    }

    // Calcula o valor total do pedido com base nos itens e seus produtos correspondentes
    public double calculateTotal() {
        double total = 0;
        for (Item item : itens) {
            Product product = findProductById(item.getProductId());
            if (product != null) {
                total += product.getProductValue() * item.getItemQuantity();
            } else {
                System.out.println("Produto com ID " + item.getProductId() + " não encontrado no cálculo do total.");
            }
        }
        return total;
    }
}




