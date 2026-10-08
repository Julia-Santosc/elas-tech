package ForEach;
//3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
//todas e mostrar a soma e a média.

public class AttTres {
    static void main() {
        int[] notas = {8, 5, 9, 7};
        int soma = 0;

        for(int nota : notas) {
            soma = soma + nota;
        }
       System.out.println("A soma das notas é: " + soma);

        double media = soma / 4.0;
        System.out.println("A média das notas é: " + media);
    }

}
