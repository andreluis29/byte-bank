public class Cliente {
    String nome, cpf, profissao = "";

    public String informacoesDeCliente(String nome, String cpf, String profissao) {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nProfissão " + profissao;
    }
}
