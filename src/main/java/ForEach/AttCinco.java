package ForEach;
//5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
//usando o índice. Deixe os dois na mesma classe e compare.
public class AttCinco {
    static void main() {
        String[] nomes = {"Josilene", "Stephany", "Beatriz", "Sofia"};

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]); // Imprime o nome que está na casinha 'i'
        }
    }
}


//EXERCICIO 1 :
//1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
//um por linha.

//static void main() {
//    String[] nomes = {"Josilene", "Stephany", "Beatriz", "Sofia"};
//
//    for (String nome : nomes) {
//        System.out.println(nome);
//    }
//}
//}
