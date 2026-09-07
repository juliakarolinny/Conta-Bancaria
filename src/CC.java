public class CC extends Conta {


    public CC(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }


    @Override
    public double calcularTarifaMensal() {
        return 12.00;
    }
}
