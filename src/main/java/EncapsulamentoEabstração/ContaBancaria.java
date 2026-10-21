package EncapsulamentoEabstração;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getNumeroConta() { return numeroConta; }

    public String getTitular() {
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String novoTitular) {
        if (novoTitular == null || novoTitular.isBlank()) {
            System.out.println("Titular inválido! Mantido " + titular);
        } else {
            titular = novoTitular;
        }
    }

    public void depositar(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        }else {
            saldo += valor;
            registrarLog("Depósito de " + valor);
        }
    }
    public void sacar(double valor){
        if (temSaldo(valor)) {
            saldo -= valor;
            registrarLog("Saque de " + valor);
        } else {
            registrarLog("Saldo insuficiente!");
        }
    }
    private boolean temSaldo(double valor) {
        return valor <= saldo;
    }

    private void registrarLog (String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }


}
