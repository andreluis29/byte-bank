public class Main {
    public static void main(String[] args) throws Exception {

        Cliente andre = new Cliente();
        andre.nome = "André Luís";
        andre.cpf = "777.157.069-51";
        andre.profissao = "Programador";

        Conta primeiraConta = new Conta();
        primeiraConta.titular = andre;
        primeiraConta.deposita(200);


        System.out.println("Informações da conta\n" 
        + andre.informacoesDeCliente(andre.nome, andre.cpf, andre.profissao));
        
        System.out.println("ag conta 1:" + primeiraConta.agencia);
        System.out.println("saldo: R$" + primeiraConta.saldo);
 

    }
}
