package AtividadesRevisao;

import java.util.Scanner;

public class InfoProduto {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        for (int num = 1; num <= 3; num++) {
            Produto novoProduto = new Produto();
            System.out.println("Digite o nome do produto " + num + ": ");
            novoProduto.nome = leitor.nextLine();

            System.out.println("Digite o preço do produto " + num + ": ");
            novoProduto.preco = leitor.nextDouble();
            leitor.nextLine();

            if (novoProduto.preco > 100) {
                System.out.printf("Produto caro! O valor é %.2f.\n ", novoProduto.preco);
            } else {
                System.out.printf("O produto %s tem o valor de %.2f. Produto com preço acessível!\n ", novoProduto.nome, novoProduto.preco);
            }

        }
    }

}




//Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
//
//Na classe principal, faça um laço for que repita 3 vezes.
//
//A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
//
//Instancie um novo Produto e guarde nele os valores digitados.
//
//Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.