public class Conta {
    double saldo;
    int agencia = 31;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    public boolean transfere(double valor, Conta conta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.deposita(valor);    
            return true;
        }
        return false;
    }
}
