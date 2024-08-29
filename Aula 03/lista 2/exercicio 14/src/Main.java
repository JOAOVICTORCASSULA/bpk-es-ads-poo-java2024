public class Main {
    public static void main(String[] args) {
        Time meuTime = new Time("Estrelas FC", "Carlos Silva");
        meuTime.adicionarJogador("João");
        meuTime.adicionarJogador("Pedro");
        meuTime.adicionarJogador("Lucas");

        meuTime.mostrarJogadores();

        meuTime.removerJogador("Pedro");
        meuTime.mostrarJogadores();

        System.out.println("Número de jogadores: " + meuTime.numeroDeJogadores());
    }
}
