public class Main {
    public static void main(String[] args) throws Exception {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("A primeira conta tem: R$" + primeiraConta.saldo);
        System.out.println("A segunda conta tem: R$" + segundaConta.saldo);
        System.out.println("ag conta 1:" + primeiraConta.agencia);
        System.out.println("ag conta 2:" + segundaConta.agencia);

        primeiraConta.transfere(40, segundaConta);

        System.out.println("Após transferência a segunda conta tem: R$" + segundaConta.saldo);

    }
}
