package FactoryAdapterFacade;

public class MainAdapter {
    public static void main(String[] args) {
        Pagamento sistemaPagamento = new PayPalAdapter();
        sistemaPagamento.pagar();

        // Pagamento sistemaPagamento = new PayPalAPI();
        // sistemaPagamento.pagar();
    }
}
