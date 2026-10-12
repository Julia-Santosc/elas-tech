package HashSet;
//6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//imprima o isEmpty() de novo.

import java.util.HashSet;

public class AtividadeSeis {
    public static void main(String[] args) {
        HashSet<String> vazio = new HashSet<>();

        // isEmpty() retorna true se o conjunto não tiver nenhum elemento
        System.out.println("Está vazio? " + vazio.isEmpty());

        vazio.add("Elemento de teste");

        // Agora que tem um item, isEmpty() retorna false
        System.out.println("Está vazio agora? " + vazio.isEmpty());
    }
}

