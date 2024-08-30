import java.util.Scanner;
public class Filme {
    public String movieTitle;
    public String directorName;
    public double lengthFilm;

    public Filme(String movieTitle, String directorName, double lengthFilm){
        this.movieTitle = movieTitle;
        this.directorName = directorName;
        this.lengthFilm = lengthFilm;
    }

    public void Presentation() {
        System.out.println("\nFilme: " + movieTitle);
        System.out.println("\nNome do diretor: " + directorName);
        System.out.println("\nDuração do filme: " + lengthFilm + " minutos");
    }

    public void MovieStart() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 para iniciar\n2 para finalizar\n0 para sair");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Iniciando filme...\nInício");break;
                case 2:
                    System.out.println("Finalizando...\nFim");break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Erro: número inválido.");
            }
        }
    }
}
