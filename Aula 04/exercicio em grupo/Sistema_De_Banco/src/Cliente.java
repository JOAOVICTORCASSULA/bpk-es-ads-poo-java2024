import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaCorrente> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome, String cpf, List<ContaCorrente> contas) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void setContas(List<ContaCorrente> contas) {
        this.contas = contas;
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
    }

    public void removerConta(ContaCorrente conta) {
        contas.remove(conta);
    }

    public void consultarContas() {
        System.out.println("\nContas do cliente " + nome + ":");
        for (ContaCorrente conta : contas) {
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Limite de saque: " + conta.getLimiteSaque());
            System.out.println("---------------------------");
        }
    }
}