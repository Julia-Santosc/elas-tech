package arrayDeque;
//5. Crie uma fila com três nomes e use contains para responder duas
//perguntas: se "Bia" está na fila e se "Zoe" está.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class AtividadeCinco {
    static void main() {
        Queue<String> fila = new LinkedList<>(Arrays.asList("Bia", "Joao", "Mariana"));

        //  "A Bia está na fila?" usando o .contains()
        boolean biaEsta = fila.contains("Bia");
        System.out.println("A Bia está na fila? " + biaEsta);

        boolean zoeEsta = fila.contains("Zoe");
        System.out.println("A Zoe está na fila? " + zoeEsta);
    }
}
