public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Cliente andre = new Cliente();
        andre.nome = "André Luís";
        andre.cpf = "777.157.069-51";
        andre.profissao = "Programador";

        Cliente orlei = new Cliente();
        orlei.nome = "Orlei Luís";
        orlei.cpf = "777.157.069-51";
        orlei.profissao = "Trader";

        Conta contaAndre = new Conta();
        contaAndre.titular = andre;
        contaAndre.deposita(5000);


        System.out.println("Informações da conta\n" 
        + andre.informacoesDeCliente(andre.nome, andre.cpf, andre.profissao));
        
        System.out.println("ag conta:" + contaAndre.agencia);
        System.out.println("saldo: R$" + contaAndre.saldo);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        Conta contaOrlei = new Conta();
        contaOrlei.titular = orlei;
        contaOrlei.deposita(5000);


        System.out.println("Informações da conta\n" 
        + orlei.informacoesDeCliente(orlei.nome, orlei.cpf, orlei.profissao));
        
        System.out.println("ag conta:" + contaOrlei.agencia);
        System.out.println("saldo: R$" + contaOrlei.saldo);
 
        System.out.println("");
        System.out.println("");
        contaAndre.transfere(300, contaOrlei);

        System.out.println("");
        System.out.println("");
        System.out.println("novo saldo de " + orlei.nome + ": R$" + contaOrlei.saldo);


    }
}
