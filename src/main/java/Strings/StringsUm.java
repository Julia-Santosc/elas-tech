package Strings;

import java.util.Scanner;

//1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

public class StringsUm {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println(nome.length());
    }
}