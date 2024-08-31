public class Main {
    public static void main(String[] args) {
        TesteAluno testeAluno = new TesteAluno("João", 123456, "Engenharia de Software");
        System.out.println(testeAluno.toString());
        testeAluno.nota();
    }
}