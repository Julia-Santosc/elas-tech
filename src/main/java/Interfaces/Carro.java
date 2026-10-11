package Interfaces;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro. ");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro. ");

    }
}

