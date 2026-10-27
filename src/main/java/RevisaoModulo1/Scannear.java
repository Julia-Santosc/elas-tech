package RevisaoModulo1;

import java.util.Scanner;

public class Scannear {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        System.out.println("Qual o seu nome? ");
        nome =leitor.nextLine();
        System.out.println("Olá " + nome);

        int idade;
        System.out.println("Quantos anos você tem? ");
        idade = leitor.nextInt();
        System.out.println("No proximo ano voce fará " + (idade + 1));

        int numero1;
        int numero2;
        System.out.println("Digite um numero ");
        numero1 = leitor.nextInt();
        System.out.println("Digite outro numero ");
        numero2 = leitor.nextInt();
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + (numero1 + numero2));

        double altura;
        double peso;
        System.out.println("Qual a sua altura? ");
        altura = leitor.nextDouble();
        System.out.println("Quanto você pesa? ");
        peso = leitor.nextDouble();


    }
}
