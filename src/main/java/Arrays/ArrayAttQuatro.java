package Arrays;

import java.util.Scanner;

//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
public class ArrayAttQuatro {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Digite cinco números: ");
        leitor.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = leitor.nextInt();
        }
        System.out.println("\nNúmeros de trás para a frente:");

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}
