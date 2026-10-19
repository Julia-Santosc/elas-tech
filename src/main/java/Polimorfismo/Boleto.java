package Polimorfismo;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("O valor do boleto é de: %.2f .\n", valor);
    }
}
