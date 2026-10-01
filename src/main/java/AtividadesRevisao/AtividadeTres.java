package AtividadesRevisao;

import java.util.Scanner;

public class AtividadeTres {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int opcaoEscolhida;

        do {
            System.out.println("1 - Ver camisas\n" +
                               "2 - Ver calças\n" +
                               "3 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcaoEscolhida = leitor.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Voce escolheu a opção 1, camisas.");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2, calças.");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opcaoEscolhida != 3);

        System.out.println("Menu Encerrado.");
    }
}


//Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
//        1 - Ver camisas
//2 - Ver calças
//3 - Sair
//Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
