package FactoryAdapterFacade;

public class ManhaFacade {
    public void acordar() {
        Despertador.desligar();
        Cafeteira.fazerCafe();
        Chuveiro.ligar();
    }
}
