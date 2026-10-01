package AtividadesRevisao;

import java.util.Scanner;

public class Desafio {
    static void main() {
        int opcao = 0;

        while (opcao != 2) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, Bem-vindo ao sistema de cadastro de notas, pressione 1 para continuar, 2 para sair.");
        opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Digite sua nota 1");
                    aluna.nota1 = leitor.nextDouble();

                    System.out.println("Digite sua nota 2");
                    aluna.nota2 = leitor.nextDouble();

                    System.out.println("Digite o seu nome");
                    aluna.nome = leitor.next();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    }else {
                        aluna.passou = false;
                    }
                    System.out.printf("A aluna %s tirou a primeira nota %.1f e a segunda nota %.1f. Sua média final foi %.1f aprovada: %b%n",
                            aluna.nome,
                            aluna.nota1,
                            aluna.nota2,
                            aluna.media,
                            aluna.passou);
                    break;
                case 2:
                    System.out.println("Encerrando o sistema, até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
                    }
            }

        }

    }



//
//Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
//Se escolher 1:
//pede a primeira nota scan nota1
//pede a segunda nota scan nota2
//calcula a média media == nota1 +nota 2 / 2
//pede o nome da aluna scan nome da aluna
//decide se ela foi aprovada (média 6 ou mais) if
//mostra uma frase com o nome, as duas notas, a média e se foi aprovada
//volta pro menu
//Se escolher 2: mostra uma mensagem de despedida e encerra
//Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu