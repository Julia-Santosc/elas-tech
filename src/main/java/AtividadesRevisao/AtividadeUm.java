package AtividadesRevisao;

/*Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n */

import java.util.Scanner;

public class AtividadeUm {
    public static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome de um lanche: ");
        String nomeLanche = leitor.nextLine();

        System.out.println("Digite o preço do lanche: ");
        double preco = leitor.nextDouble();

        if (preco >= 30.0) {
            preco = preco - 5.0;
        }

        System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f", preco);
    }
}



/* static void main() {
        Scanner leitor = new Lanche(System.in);
        System.out.println("Digie o nome do lanche desejado.");

        System.out.println("O lanche " + nomeLanche "custa: $" + preco);
        String cor = double.nextLine();




    }*/