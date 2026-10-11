package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class AttQuatro {
    static void main() {
        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Sapato", 12);
        produtos.put("Blusa", 3);

        System.out.println(produtos.getOrDefault("Brinco", 0));

//        System.out.println(produtos.get("Brinco"));


    }
}



//4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//Use getOrDefault para mostrar a quantidade de um produto que existe
//e de um que não existe (devolvendo 0). Depois tente com get normal
//no que não existe e compare.