package ArrayDeque;
//4. Crie uma fila com três nomes e atenda todos usando
//while (!fila.isEmpty()). No final, imprima "Fila vazia!".
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AtividadeQuatro {
    static void main() {
        Queue<String> fila = new LinkedList<>(Arrays.asList("Gabi", "Joao", "Julia"));

        //"Enquanto a fila NÃO estiver vazia (!fila.isEmpty())..."
        while (!fila.isEmpty()) {
            // Atende e remove quem está na frente
            String pessoa = fila.poll();
            System.out.println("Atendendo: " + pessoa);
        }

        //Quando a fila esvazia completamente, e o while acaba
        System.out.println("Fila vazia!");
    }

}
