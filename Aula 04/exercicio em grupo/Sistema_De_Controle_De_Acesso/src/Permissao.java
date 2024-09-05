import java.util.Objects;

public class Permissao {
    private String nome;

    public Permissao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permissao permissao = (Permissao) o;
        return Objects.equals(nome, permissao.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Permissao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

