package ForEach;
//1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
//um por linha.
public class AttUm {
    static void main() {
        String[] nomes = {"Josilene", "Stephany", "Beatriz", "Sofia"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
