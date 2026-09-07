import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    CC contacorrente = new CC("1111", "22222", "Julia", 11.0);
    CP contapoupanca = new CP("22222", "11111", "Ester", 2.0);
    PJ pessoajuridica = new PJ("88888", "33333", "Jhullya PJ", 5.90);

    println("SEJA BEM-VINDO AO MEU BANCO!");
    int opcoes = -1;

    while (opcoes != 0) {
        println("\nMENU");
        println("1. REALIZAR DEPOSITO");
        println("2. REALIZAR SAQUE");
        println("3. CONSULTAR SALDO");
        println("4. CONSULTAR TARIFAS MENSAIS");
        println("0. SAIR");

        opcoes = Integer.parseInt(readln("Selecione a opção desejada: "));


        switch (opcoes) {
            case 1 -> {
                println("\n EFETUAR DEPOSITOS");
                println("1. CONTA CORRENTE");
                println("2. CONTA POUPANCA");
                println("3. CONTA PESSOA JURIDICA");
                int conta = Integer.parseInt(readln("Selecione a conta: "));
                double valor = Double.parseDouble(readln("Digite o valor do depósito: R$ "));

                switch (conta) {
                    case 1 -> contacorrente.depositar(valor);
                    case 2 -> contapoupanca.depositar(valor);
                    case 3 -> pessoajuridica.depositar(valor);
                    default -> println("Conta inválida!");
                }
            }
            case 2 -> {
                println("\n REALIZAR SAQUE");
                println("1. CONTA CORRENTE");
                println("2. CONTA POUPANCA");
                println("3. CONTA PESSOA JURIDICA (Taxa de R$ 1,20)");
                int conta = Integer.parseInt(readln("Selecione a conta: "));
                double valor = Double.parseDouble(readln("Digite o valor do saque: R$ "));

                switch (conta) {
                    case 1 -> contacorrente.sacar(valor);
                    case 2 -> contapoupanca.sacar(valor);
                    case 3 -> pessoajuridica.sacar(valor);
                    default -> println("Conta inválida!");
                }
            }
            case 3 -> {
                println("\n EXIBICAO DE SALDOS");
                contacorrente.exibirSaldo();
                contapoupanca.exibirSaldo();
                pessoajuridica.exibirSaldo();
            }
            case 4 -> {
                println("\n TARIFAS MENSAIS");
                println("Tarifa Conta Corrente: R$ " + contacorrente.calcularTarifaMensal());
                println("Tarifa Conta Poupança: R$ " + contapoupanca.calcularTarifaMensal());
                println("Tarifa Conta PJ: R$ " + pessoajuridica.calcularTarifaMensal());
            }
            case 0 -> println("Encerrando o sistema...");
            default -> println("Opção inválida! Escolha um número do menu.");
        }
    }
}