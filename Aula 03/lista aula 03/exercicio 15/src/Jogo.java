public class Jogo {
        private String nome;
        private String genero;
        private double preco;
        private boolean emExecucao;

        public Jogo(String nome, String genero, double preco) {
            this.nome = nome;
            this.genero = genero;
            this.preco = preco;
            this.emExecucao = false;
        }

        public void iniciar() {
            if (!emExecucao) {
                emExecucao = true;
                System.out.println("O jogo " + nome + " foi iniciado.");
            } else {
                System.out.println("O jogo " + nome + " já está em execução.");
            }
        }

        public void pausar() {
            if (emExecucao) {
                emExecucao = false;
                System.out.println("O jogo " + nome + " foi pausado.");
            } else {
                System.out.println("O jogo " + nome + " não está em execução.");
            }
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public double getPreco() {
            return preco;
        }
}
