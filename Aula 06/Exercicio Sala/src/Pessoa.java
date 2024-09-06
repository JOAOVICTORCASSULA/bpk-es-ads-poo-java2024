import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String name;
    private int idade;
    private List<Endereco> enderecos;

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
        enderecos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Endereco> incluirEndereco(Endereco endereco) {
        enderecos.add(endereco);
        return enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", enderecos=" + enderecos +
                '}';
    }
}