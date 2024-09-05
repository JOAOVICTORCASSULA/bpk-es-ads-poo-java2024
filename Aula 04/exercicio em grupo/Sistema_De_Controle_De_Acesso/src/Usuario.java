import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String login;
    private String senhaCriptografada;
    private Set<Permissao> permissoes = new HashSet<>();

    public Usuario(String nome, String login, String senhaCriptografada) {
        this.nome = nome;
        this.login = login;
        this.senhaCriptografada = senhaCriptografada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaCriptografada() {
        return senhaCriptografada;
    }

    public void setSenhaCriptografada(String senhaCriptografada) {
        this.senhaCriptografada = senhaCriptografada;
    }

    public Set<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Set<Permissao> permissoes) {
        this.permissoes = permissoes;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senhaCriptografada.equals(criptografarSenha(senha));
    }

    private String criptografarSenha(String senha) {
        return Integer.toHexString(senha.hashCode());
    }

    public void adicionarPermissao(Permissao permissao) {
        this.permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao) {
        this.permissoes.remove(permissao);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", permissoes=" + permissoes +
                '}';
    }
}

