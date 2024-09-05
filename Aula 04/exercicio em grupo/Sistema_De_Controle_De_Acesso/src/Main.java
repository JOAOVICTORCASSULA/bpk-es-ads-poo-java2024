public class Main {
    public static void main(String[] args) {
        // Criando permissões
        Permissao permissao1 = new Permissao("ADMIN");
        Permissao permissao2 = new Permissao("USER");

        // Criando um usuário
        Usuario usuario = new Usuario("João Silva", "joao.silva", "senha123");

        // Adicionando permissões ao usuário
        usuario.adicionarPermissao(permissao1);
        usuario.adicionarPermissao(permissao2);

        // Exibindo informações do usuário
        System.out.println("Informações do Usuário após adicionar permissões:");
        System.out.println(usuario);

        // Removendo uma permissão
        usuario.removerPermissao(permissao1);

        // Exibindo informações do usuário após remover uma permissão
        System.out.println("\nInformações do Usuário após remover uma permissão:");
        System.out.println(usuario);

        // Autenticando o usuário
        boolean autenticado = usuario.autenticar("joao.silva", "senha123");
        System.out.println("\nUsuário autenticado: " + autenticado);

        // Tentando autenticar com senha incorreta
        boolean autenticadoIncorreto = usuario.autenticar("joao.silva", "senhaErrada");
        System.out.println("Usuário autenticado com senha incorreta: " + autenticadoIncorreto);
    }
}
