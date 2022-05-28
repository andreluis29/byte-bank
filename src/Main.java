import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente andre = new Cliente();
        andre.setNome("André Luís");
        andre.setCpf("1");
        andre.setProfissao("Desenvolvedor Java");
        boolean foiPermitidoAcesso = andre.podeAcessar(JOptionPane.showInputDialog(null, "Digite seu cpf: "));
        System.out.println(foiPermitidoAcesso);
        if (foiPermitidoAcesso == true) {
            Conta contaAndre = new Conta();
            contaAndre.setTitular(andre);
            contaAndre.deposita(5000);
            contaAndre.setNumero(39218);

            JOptionPane.showMessageDialog(null, "Informações de cliente \n" 
            + andre.informacoesDeCliente(andre.getNome(), andre.getCpf(), andre.getProfissao()));
            JOptionPane.showMessageDialog(null, "Informações da conta acessada \n");
            JOptionPane.showMessageDialog(null, "Titular: " + contaAndre.getTitular().getNome());
            JOptionPane.showMessageDialog(null, "ag conta:" + contaAndre.getAgencia());
            JOptionPane.showMessageDialog(null, "número da conta: " + contaAndre.getNumero());
            JOptionPane.showMessageDialog(null, "saldo: R$" + contaAndre.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Não identificado");
        }
    }
}
