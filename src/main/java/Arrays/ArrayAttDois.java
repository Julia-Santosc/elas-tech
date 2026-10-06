package Arrays;
//2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
//3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

public class ArrayAttDois {
    static void main() {

        int[] nota = {8, 6, 10, 7, 9};
        int soma = 0;

        for(int i = 0; i < nota.length; i++) {
            soma = soma + nota [i];
            System.out.println("Nota " + (i + 1) + ": " + nota[i]);
        }
        double media = (double) soma / nota.length;
        System.out.println("A média é: " + media);

    }
}




