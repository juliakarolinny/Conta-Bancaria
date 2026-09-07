public class PJ extends Conta {

    public PJ(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular,saldo);
    }

    public void sacar(double valor) {
        double taxa = 1.20; // Taxa adicional da PJ (R$ 1,20)
        double valorTotal = valor + taxa;

        if (valor > 0 && valorTotal <= saldo) {
            saldo = saldo - valorTotal;
           IO.println("Saque de R$ " + valor + " realizado com sucesso! (Taxa de R$ " + taxa + " cobrada)");
        } else {
            IO.println("ERRO: Saldo insuficiente para cobrir o saque e a taxa!");
        }
    }

    public double calcularTarifaMensal() {
        return 20.0;
    }
}
