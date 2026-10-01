package AtividadesRevisao;

import java.util.Scanner;

public class AtividadeSeis {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o seu ano de nascimento.");
        int anoNascimento = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Escreva seu nome completo.");
        String nomeCompleto = scanner.nextLine();

        System.out.println("O usuário " + nomeCompleto + "nasceu em " + anoNascimento + "." );

    }

}
//Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
//
//Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
//
//Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
//
//        Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
