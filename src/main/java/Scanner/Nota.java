package Scanner;

import java.util.Scanner;

//3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
public class Nota {
    static void main() {
        double nota;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual foi sua nota nesta atividade?");
        nota = leitor.nextDouble();

        if (nota >= 7) {
            System.out.println("Voce foi aprovada!");
            nota = leitor.nextDouble();
        } if (nota >= 5 && nota <= 6.9) {
            System.out.println("Voce esta de recuperação!");
        } if (nota < 5){
            System.out.println("Voce foi reprovada!");
        }

    }
}
