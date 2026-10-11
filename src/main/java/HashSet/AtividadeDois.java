package HashSet;

import java.util.HashSet;
import java.util.Arrays;

//2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//de um if para avisar se a cor "verde" já está no conjunto ou não.

public class AtividadeDois {
    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();

        // addAll adiciona vários elementos de uma vez
        cores.addAll(Arrays.asList("azul", "vermelho", "amarelo"));

        // contains verifica se o elemento existe no conjunto
        if (cores.contains("verde")) {
            System.out.println("A cor 'verde' já está no conjunto.");
        } else {
            System.out.println("A cor 'verde' NÃO está no conjunto.");
        }
    }
}