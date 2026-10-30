package arrayDeque;

import java.util.ArrayDeque;
import java.util.List;
//2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//imprima a fila logo depois. Repare que ela não mudou.
public class AtividadeDois {
    public static void main(String[] args) {
        // Criando a fila com várias pessoas : addAll
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.addAll(List.of("Joao", "Carla", "Beatriz"));

        // peek é pra dar uma espiada em quem ta na frente (Joao)
        System.out.println("Próximo da fila (peek): " + fila.peek());

        // Imprimindo a fila, sem ela mudar!!
        System.out.println("Fila atual: " + fila);
    }
}

