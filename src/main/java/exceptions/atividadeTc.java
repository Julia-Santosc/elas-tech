package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atividadeTc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro (divisor): ");
            int numero2 = scanner.nextInt();
            int resultado = numero1 / numero2;

            System.out.println("O resultado de " + numero1 + " dividido por " + numero2 + " é: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: Não é possível realizar uma divisão por zero. Por favor, tente novamente com um divisor válido.");

        } catch (InputMismatchException e) {
            // caso o usuário digite letras em vez de números
            System.out.println("Erro de entrada: Você deve digitar apenas números inteiros.");

        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}



//Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.