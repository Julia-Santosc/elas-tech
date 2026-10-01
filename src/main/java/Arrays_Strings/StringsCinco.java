package Arrays_Strings;

 // 5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

import java.util.Scanner;

public class StringsCinco {
    static void main() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Digite seu nome minusculo: ");
        String nomeMinusculo = scanner.nextLine();

        System.out.println("Digite seu nome Maiusculo: ");
        String nomeMaiusculo = scanner.nextLine();

        System.out.println(nomeMinusculo.equalsIgnoreCase(nomeMaiusculo));
   }

    }

