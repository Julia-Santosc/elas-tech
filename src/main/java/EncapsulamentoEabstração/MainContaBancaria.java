package EncapsulamentoEabstração;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
//        System.out.println(contaBancaria.getSaldo());
//        System.out.println(contaBancaria.getTitular());
        contaBancaria.setTitular("Joao");

        contaBancaria.depositar(500);
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        contaBancaria.depositar(-100);
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        contaBancaria.sacar(2000);
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        contaBancaria.sacar(200);
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        System.out.println(contaBancaria.getNumeroConta());
    }
}
