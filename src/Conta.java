public class Conta {
    private double saldo;
    private int numero;
    private int agencia = 31;
    private Cliente titular;

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

    public double getSaldo() {
        return this.saldo;
    }

    public double getNumero() {
        return this.numero;
    }

    public int setNumero(int numero) {
        return this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public Cliente setTitular(Cliente titular) {
        return this.titular = titular;
    }

}
