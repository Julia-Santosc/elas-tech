package Polimorfismo;

public class Pix implements  MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("O pix é no valor de: %.2f .\n", valor);
    }
}
