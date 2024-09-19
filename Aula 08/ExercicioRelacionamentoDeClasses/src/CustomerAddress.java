public class CustomerAddress {
    // Atributos para armazenar as informações do endereço
    private String addressStreet;
    private String addressNeighborhood;
    private int numHouse;
    private String addressCep;
    private String addressCity;

    // Construtor da classe, inicializa os atributos com os valores fornecidos
    public CustomerAddress(String addressStreet, String addressNeighborhood, int numHouse, String addressCep, String addressCity) {
        setAddressStreet(addressStreet);
        setAddressNeighborhood(addressNeighborhood);
        setNumHouse(numHouse);
        setAddressCep(addressCep);
        setAddressCity(addressCity);
    }

    // Getter para o nome da rua
    public String getAddressStreet() {
        return addressStreet;
    }

    // Setter para o nome da rua, com validação para garantir que o valor não seja nulo
    public void setAddressStreet(String addressStreet) {
        if (addressStreet == null) {
            System.out.println("Erro: Rua vazia.");
        }
        this.addressStreet = addressStreet;
    }

    // Getter para o bairro
    public String getAddressNeighborhood() {
        return addressNeighborhood;
    }

    // Setter para o bairro, com validação para garantir que o valor não seja nulo
    public void setAddressNeighborhood(String addressNeighborhood) {
        if (addressNeighborhood == null) {
            System.out.println("Erro: Bairro vazio");
        }
        this.addressNeighborhood = addressNeighborhood;
    }

    // Getter para o número da casa
    public int getNumHouse() {
        return numHouse;
    }

    // Setter para o número da casa, com validação para garantir que o valor seja maior que 0
    public void setNumHouse(int numHouse) {
        if (numHouse <= 0) {
            System.out.println("Erro: Número da casa vazio");
        }
        this.numHouse = numHouse;
    }

    // Getter para o CEP
    public String getAddressCep() {
        return addressCep;
    }

    // Setter para o CEP, com validação para garantir que o valor não seja nulo
    public void setAddressCep(String addressCep) {
        if (addressCep == null) {
            System.out.println("Erro: Cep vazio");
        }
        this.addressCep = addressCep;
    }

    // Getter para a cidade
    public String getAddressCity() {
        return addressCity;
    }

    // Setter para a cidade, com validação para garantir que o valor não seja nulo
    public void setAddressCity(String addressCity) {
        if (addressCity == null) {
            System.out.println("Erro: Cidade vazia");
        }
        this.addressCity = addressCity;
    }
}

