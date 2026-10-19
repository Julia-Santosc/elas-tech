package EncapsulamentoEabstração;

public class ContaBancaria {
    private String titular;
    private double saldo;

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
            System.out.println("Recusado!");
        }
    }
    public void sacar(double valor){
        if (temSaldo(valor)) {
            System.out.println("Sacando!");
        } else {
            System.out.println("Recusado! Sem Saldo");
        }
    }
    private boolean temSaldo(double valor) {
        if (valor > saldo) {
            return false;
        }else {
            return true;
        }
    }


}
