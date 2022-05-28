public class Main {
    public static void main(String[] args) throws Exception {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A primeira conta tem: R$" + primeiraConta.saldo);
        System.out.println("A segunda conta tem: R$" + segundaConta.saldo);
        System.out.println("ag conta 1:" + primeiraConta.agencia);
        System.out.println("ag conta 2:" + segundaConta.agencia);

    }
}
