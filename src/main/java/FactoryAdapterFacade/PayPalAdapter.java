package FactoryAdapterFacade;

public class PayPalAdapter implements Pagamento {
    @Override
    public void pagar() {
        PayPalAPI payPalApi = new PayPalAPI();

        payPalApi.sendPayment();
    }
}
