package lambda3;

import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        //Consumer algo entra, nada sai.
        Consumer<String> saudar = nome -> System.out.println("Olá, " + nome);
        saudar.accept("Joao");

        Consumer<String> emMaiusculo = nome -> System.out.println(nome.toUpperCase());

        emMaiusculo.accept("Joao");
    }
}
