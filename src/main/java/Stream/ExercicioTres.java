package Stream;

import java.util.Arrays;
import java.util.List;

public class ExercicioTres {
    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("São Paulo", "Rio de Janeiro", "Salvador");
        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S") || cidade.startsWith("s"))
                .count();
        System.out.println("Quantidade de cidades que começam com S: " + quantidade);
    }

}
