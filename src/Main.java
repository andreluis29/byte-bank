import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("André Luís");
        andre.setCpf("1");
        andre.setProfissao("Desenvolvedor Java");
        String cpfDigitado = JOptionPane.showInputDialog(null, "Digite seu cpf:");
        boolean foiPermitidoAcesso = andre.podeAcessar(cpfDigitado);
        if (foiPermitidoAcesso == true) {

            Conta contaAndre = new Conta();
            contaAndre.setTitular(andre);
            contaAndre.deposita(5000);
            contaAndre.setNumero(39218);

            JOptionPane.showMessageDialog(null, "Informações de cliente \n" 
            + andre.informacoesDeCliente(andre.getNome(), andre.getCpf(), andre.getProfissao())
            + " \nInformações da conta acessada \n" + " \nTitular: " + contaAndre.getTitular().getNome() +
            " \nag conta:" + contaAndre.getAgencia() + " \nnúmero da conta: " + contaAndre.getNumero() +
            " \nsaldo: R$" + contaAndre.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Não identificado");
        }
    }
}
