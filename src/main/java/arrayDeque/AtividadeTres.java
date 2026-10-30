package arrayDeque;

import java.util.ArrayDeque;
import java.util.List;
//3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//depois. Compare com o exercício 2.

public class AtividadeTres {
    static void main() {
            ArrayDeque<String> fila = new ArrayDeque<>();
            fila.addAll(List.of("Joao", "Carla", "Beatriz"));

            // Usando a mesma fila do exercício 2 (Joao, Carla, Beatriz)

            String atendido = fila.poll(); // .poll() é para atender a primeira pessoa da fila

             System.out.println("Atendido agora: " + atendido); // Vai mostrar "Daniel"

            // 2. Imprimimos a fila depois de atender
            System.out.println(fila);
    }
}
