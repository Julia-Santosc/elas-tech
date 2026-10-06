package Strings;

//3 — Peça o nome da pessoa e mostre a primeira letra dele.

import java.util.Scanner;

public class StringsTres {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(nome.charAt(0));
    }
}


