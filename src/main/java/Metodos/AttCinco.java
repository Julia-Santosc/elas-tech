package Metodos;
//5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.

import java.util.Scanner;

public class AttCinco {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade : ");
        idade = sc.nextInt();
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Você é MAIOR de idade!");
        } else {
            System.out.println("Você é MENOR de idade!");
        }

    }
    static boolean ehMaiorDeIdade(int idade) {
        if (idade >= 18) {
            return true ;
        } else {
            return false;
        }
    }

    }

