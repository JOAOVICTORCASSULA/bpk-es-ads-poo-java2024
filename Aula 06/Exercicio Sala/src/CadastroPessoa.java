public class CadastroPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 18);
        Endereco endereco = new Endereco("Centro", "85830000", "Formosa do Oeste", "PR");

        pessoa.incluirEndereco(endereco);

        System.out.println(pessoa.toString());
    }
}
 