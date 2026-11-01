package Stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ExercicioUm {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter( numero -> numero  % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(pares);
    }
}
