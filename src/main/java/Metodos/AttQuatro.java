package Metodos;
/*4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.*/

import java.util.Scanner;

public class AttQuatro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota : ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota : ");
        double n2 = sc.nextDouble();

        double media = calcularMedia(n1, n2);

        calcularMedia(n1, n2);

        System.out.println("A sua média final é : " + media );

    }
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2 ;
    }

}
