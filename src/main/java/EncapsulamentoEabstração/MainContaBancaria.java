package EncapsulamentoEabstração;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println(contaBancaria.getSaldo());
        System.out.println(contaBancaria.getTitular());
        contaBancaria.setTitular("Joao");
        System.out.println(contaBancaria.getTitular());
        contaBancaria.setTitular(null);
    }
}
