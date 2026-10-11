package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainV {
    static void main() {

        List<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

        Carro lancer = new Carro();

        Moto fan = new Moto();

        listaDeVeiculos.add(lancer);
        listaDeVeiculos.add(fan);

        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }

    }
}
