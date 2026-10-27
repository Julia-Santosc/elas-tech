package RevisaoModulo1;

public class Operadores {
    public static void main(String[] args) {

        // 1. Operações básicas
        int a = 15;
        int b = 4;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // 2. Saldo e atribuição (+= e -=)
        double saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: R$ " + saldo);

        // 3. Comparações
        int x = 10;
        int y = 10;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x >= y: " + (x >= y));

        // 4. Operador lógico &&
        int idade = 20;
        boolean temCarteira = true;
        System.out.println("Pode dirigir? " + (idade >= 18 && temCarteira));

        // 5. Resto da divisão por 2
        int numero = 7;
        System.out.println("Resto de " + numero + " / 2: " + (numero % 2));

        // 6. Total da compra
        int pacotes = 3;
        double precoArroz = 5.50;
        System.out.println("Total compra: R$ " + (pacotes * precoArroz));

        // Mini-desafio
        int numDesafio = 15;
        boolean eDivisivel = (numDesafio % 3 == 0) && (numDesafio % 5 == 0);
        System.out.println("É divisível por 3 e 5? " + eDivisivel);
    }
}
