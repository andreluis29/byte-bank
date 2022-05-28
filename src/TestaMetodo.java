public class TestaMetodo {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.deposita(200);

        System.out.println("Saldo antes do saque: " + conta.saldo);
        boolean saqueComSucesso = conta.saca(20);

        if(saqueComSucesso == true) {
            System.out.println("Saldo após o saque: " + conta.saldo);
        } else {
            System.out.println("Saldo menor que valor");
        }

        

    }
}
