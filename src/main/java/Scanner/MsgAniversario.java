package Scanner;

//1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

import java.util.Scanner;

public class MsgAniversario {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Escreva o seu nome: ");
        nome =leitor.nextLine();
        System.out.println("Escreva sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Olá " + nome + ", voce tem " + idade + " anos e vai fazer " + (idade + 1) + " no préximo aniversário.");

    }

}
