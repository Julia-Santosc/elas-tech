package AtividadesRevisao;

public class AtividadeDois {
    static void main() {
        for (int num = 1; num <= 15; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " é Par.");
            } else {
                System.out.println(num + " é ímpar.");
            }
        }
    }

}
//Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
//Imprima na tela o número e a palavra correspondente.
//Exemplo de saída:
//        "1 é Ímpar"
//        "2 é Par"