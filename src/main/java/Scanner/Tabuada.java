package Scanner;
//4 - Peça um número e mostre a tabuada dele de 1 a 10.

import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int num;
        System.out.println("Digite um número :");
        num = leitor.nextInt();
        System.out.println("A tabuada de " + num + " é: ");

        int contador = 1;

        while (contador <= 10) {
            System.out.println(num + "x" + contador + "=" + num * contador);

            contador++;

        }
    }
}
