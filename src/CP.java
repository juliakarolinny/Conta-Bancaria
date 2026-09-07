public class CP extends Conta{
    public CP(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular,saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.00;
    }
}
