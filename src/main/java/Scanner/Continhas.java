package Scanner;

//2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

import java.util.Scanner;

public class Continhas {
    static void main() {
        Scanner pede = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("Digite um número: ");
        num = pede.nextInt();
        System.out.println("Digite outro número: ");
        num2 = pede.nextInt();

        System.out.println("A soma de " + num + " com " + num2 + " é: " + (num + num2));
        System.out.println("A subtração de " + num + " com " + num2 + " é: " + (num - num2));
        System.out.println("A multiplicação de " + num + " com " + num2 + " é: " + (num * num2));
        System.out.println("A divisão do número " + num + " com " + num2 + " é: " + (num / num2));
        System.out.println("O resto da divisão do número " + num + " por " + num2 + " é: " + (num % num2));


    }

}
