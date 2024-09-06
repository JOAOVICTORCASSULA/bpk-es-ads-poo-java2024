import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Livro> incluirEndereco(Livro livro) {
        livros.add(livro);
        return livros;
    }

}
