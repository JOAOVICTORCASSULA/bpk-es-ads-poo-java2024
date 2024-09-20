import java.util.List;
import java.util.ArrayList;

public class Customer {
    // Atributos para armazenar informações do cliente e suas listas de endereços
    private String customerName;
    private String customerCpf;
    private List<CustomerAddress> customerAddress;

    // Construtor da classe, inicializa os atributos com os valores fornecidos
    public Customer(String customerName, String customerCpf) {
        setCustomerName(customerName);
        setCustomerCpf(customerCpf);
        this.customerAddress = new ArrayList<>();
    }

    // Getter para o nome do cliente
    public String getCustomerName() {
        return customerName;
    }

    // Setter para o nome do cliente, com validação para garantir que o valor não seja nulo
    public void setCustomerName(String customerName) {
        if (customerName == null) {
            System.out.println("Erro: Nome do Cliente Vazio");
        }
        this.customerName = customerName;
    }

    // Getter para o CPF do cliente
    public String getCustomerCpf() {
        return customerCpf;
    }

    // Setter para o CPF do cliente, com validação para garantir que o valor não seja nulo
    public void setCustomerCpf(String customerCpf) {
        if (customerCpf == null) {
            System.out.println("Erro: Cpf do Cliente Vazio");
        }
        this.customerCpf = customerCpf;
    }

    // Adiciona um endereço ao cliente
    public void AddCustomerAddress(String addressStreet, String addressNeighborhood, int numHouse, String addressCep, String addressCity) {
        CustomerAddress address = new CustomerAddress(addressStreet, addressNeighborhood, numHouse, addressCep, addressCity);
        customerAddress.add(address);
    }

    // Lista todos os endereços do cliente
    public void listAddresses() {
        System.out.println("\n---Informações do Cliente---\n");
        System.out.println("Cliente: " + customerName);
        for (CustomerAddress address : customerAddress) {
            System.out.println("Rua: " + address.getAddressStreet());
            System.out.println("Bairro: " + address.getAddressNeighborhood());
            System.out.println("Número da Casa: " + address.getNumHouse());
            System.out.println("Cep: " + address.getAddressCep());
            System.out.println("Cidade: " + address.getAddressCity());
        }
    }
}

