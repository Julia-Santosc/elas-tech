package lambda3;

import java.util.Random;
import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        //Supplier nada entra, algo sai.
        Supplier<String> mensagemAviso = () -> "Aviso: O sistema está online!";
        System.out.println(mensagemAviso.get());

        Random random = new Random();
        Supplier<Integer> numeroAleatorio = () -> random.nextInt(100);

        System.out.println("Primeira chamada: " + numeroAleatorio.get());
        System.out.println("Segunda chamada: " + numeroAleatorio.get());
    }
}
