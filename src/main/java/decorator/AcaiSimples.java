package decorator;

public class AcaiSimples implements  Acai {
    public String getDescricao(){
        return "Açaí simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}
