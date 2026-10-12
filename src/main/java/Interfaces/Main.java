package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();

        Gato meuGato = new Gato();
        meuGato.emitirSom();
            //Atividade 3
        ArrayList<Animal> animais = new ArrayList<>(); // coloco os passageiros no onibus (arraylist).

        animais.add(new Cachorro()); // Entrou um cachorro!
        animais.add(new Gato());     // Entrou um gato!

        for (Animal passageiro : animais) {
            passageiro.emitirSom();
        }
    }
}

