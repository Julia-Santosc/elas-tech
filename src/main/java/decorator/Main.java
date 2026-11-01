package decorator;

public class Main {
    public static void main(String[] args) {
        Acai acaiComGranola = new AcaiDecorator(new Acai() {
            @Override
            public String getDescricao() {
                return "Açaí"; // Base do açaí
            }

            @Override
            public double getPreco() {
                return 10.0; // Preço da base
            }
        }) {
            @Override
            public String getDescricao() {
                return acaiEmbrulhado.getDescricao() + " com granola";
            }

            @Override
            public double getPreco() {
                return acaiEmbrulhado.getPreco() + 2.00; // Preço somado da granola
            }
        };
    }
}
