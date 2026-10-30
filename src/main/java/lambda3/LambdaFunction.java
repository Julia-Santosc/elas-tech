package lambda3;

import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        //Function entra um tipo, sai outro.
        Function<Integer, String> gerarNota = numero -> "Nota Fiscal n°:" + numero;

        System.out.println(gerarNota.apply(1542));

        Function<String, Integer> quantasLetras = (palavra) -> palavra.length() ;
        Integer tamanho = quantasLetras.apply("Professor");
        System.out.println(tamanho);
    }
}
