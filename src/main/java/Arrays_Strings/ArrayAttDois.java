package Arrays_Strings;

public class ArrayAttDois {
    static void main() {

        int[] nota = {8, 6, 10, 7, 9};
        int soma = 0;

        for(int i = 0; i < nota.length; i++) {
            soma = soma + nota [i];
            System.out.println("Nota " + (i + 1) + ":" + nota[i] + soma);
        }
        double media = (double) soma / nota.length;
        System.out.println("A média é: " + media);

    }
}


