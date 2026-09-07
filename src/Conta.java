public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;


    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            IO.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            IO.println("ERRO: Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            IO.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            IO.println("ERRO: Saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        IO.println("Titular: " + titular + " | Agência: " + agencia + " | Conta: " + numero + " | Saldo: R$ " + saldo);
    }

    public abstract double calcularTarifaMensal();
}