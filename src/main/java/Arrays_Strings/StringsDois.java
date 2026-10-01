package Arrays_Strings;

// 2 — Peça o nome da pessoa e mostre ele todo em maiusculo e todo em minúsculo.

import java.util.Locale;
import java.util.Scanner;

public class StringsDois {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());


    }
}


