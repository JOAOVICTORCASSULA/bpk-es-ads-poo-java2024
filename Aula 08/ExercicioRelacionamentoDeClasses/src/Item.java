public class Item {
    // Atributos para armazenar o ID do produto e a quantidade do item
    private int productId;
    private int itemQuantity;

    // Construtor da classe, inicializa os atributos com os valores fornecidos
    public Item(int productId, int itemQuantity) {
        this.productId = productId;
        this.itemQuantity = itemQuantity;
    }

    // Getter para o ID do produto
    public int getProductId() {
        return productId;
    }

    // Getter para a quantidade do item
    public int getItemQuantity() {
        return itemQuantity;
    }
}




