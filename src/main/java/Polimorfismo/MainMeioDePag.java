package Polimorfismo;

public class MainMeioDePag {
    public static void main(String[] args) {
        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(49.99);


        forma = new Boleto();
        forma.pagar(199.95);

    }
}
