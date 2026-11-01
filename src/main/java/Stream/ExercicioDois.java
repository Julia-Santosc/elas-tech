package Stream;

import java.util.List;

public class ExercicioDois {
    public static void main(String[] args) {
        List<String> frutas = List.of("maçã", "banana", "laranja", "pêra");

        frutas.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
