package ArrayDeque;
//6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//        - se estiver vazia  -> "Não tem ninguém na fila."
//        - se tiver gente    -> "Próximo: [nome]"
//        Depois adicione uma pessoa e teste de novo.

import java.util.LinkedList;
import java.util.Queue;

public class AtividadeSeis {
    static void main() {
        Queue<String> fila = new LinkedList<>();

        // Antes de usar o peek (para não dar erro se não tiver ninguém), testandoc om if/else
        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }
        fila.add("Joao"); //adicionando uma pessoa na fila

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek()); // Agora vai achar o Joao
        }
    }
}
