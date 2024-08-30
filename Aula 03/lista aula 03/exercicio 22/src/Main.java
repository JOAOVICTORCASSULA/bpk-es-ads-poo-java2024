public class Main {
    public static void main(String[] args) {
        TesteEmpresa testeEmpresa = new TesteEmpresa("Tech Solutions", "12.345.678/0001-90", 50);
        System.out.println(testeEmpresa.toString());
        testeEmpresa.gerenciarFuncionarios();
    }
}