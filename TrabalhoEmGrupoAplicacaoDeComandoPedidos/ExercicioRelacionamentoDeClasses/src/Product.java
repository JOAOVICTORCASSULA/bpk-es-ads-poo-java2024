public class Product {
    // Atributos para armazenar informações do produto
    private String productName;
    private int numProduct;
    private double productValue;
    private int productQuantity;

    // Construtor da classe, inicializa os atributos com os valores fornecidos
    public Product(String productName, int numProduct, double productValue, int productQuantity) {
        setProductName(productName);
        setNumProduct(numProduct);
        setProductValue(productValue);
        setProductQuantity(productQuantity);
    }

    // Getter para o nome do produto
    public String getProductName() {
        return productName;
    }

    // Setter para o nome do produto, com validação para garantir que o valor não seja nulo
    public void setProductName(String productName) {
        if (productName == null) {
            System.out.println("Erro: Nome do Produto Vazio");
        }
        this.productName = productName;
    }

    // Getter para o número do produto
    public int getNumProduct() {
        return numProduct;
    }

    // Setter para o número do produto, com validação para garantir que o valor seja maior que 0
    public void setNumProduct(int numProduct) {
        if (numProduct <= 0) {
            System.out.println("Erro: Número do Produto Vazio");
        }
        this.numProduct = numProduct;
    }

    // Getter para o valor do produto
    public double getProductValue() {
        return productValue;
    }

    // Setter para o valor do produto, com validação para garantir que o valor seja maior que 0
    public void setProductValue(double productValue) {
        if (productValue <= 0) {
            System.out.println("Erro: Valor do Produto Vazio");
        }
        this.productValue = productValue;
    }

    // Getter para a quantidade de produtos
    public int getProductQuantity() {
        return productQuantity;
    }

    // Setter para a quantidade de produtos, com validação para garantir que o valor seja maior que 0
    public void setProductQuantity(int productQuantity) {
        if (productQuantity <= 0) {
            System.out.println("Erro: Quantidade de Produtos Vazia");
        }
        this.productQuantity = productQuantity;
    }
}

