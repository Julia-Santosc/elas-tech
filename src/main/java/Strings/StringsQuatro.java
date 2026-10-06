package Strings;


import java.util.Scanner;

public class StringsQuatro {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase. ");
        String frase = scanner.nextLine();

        System.out.println(frase.contains("Java"));

        System.out.println("Digite uma palavra. ");
        String palavra = scanner.nextLine();

        System.out.println(palavra.contains("Java"));

    }

}



/*4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
Digite uma frase: Estou aprendendo Java
Digite uma palavra: Java
A palavra aparece na frase?*/