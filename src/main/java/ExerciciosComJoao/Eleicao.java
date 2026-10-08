package ExerciciosComJoao;

import java.util.Scanner;

public class Eleicao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // TIPO, OBJETO. new= função de instaciamento, SCANNER a classe que ta sendo instanciada, System.in é o PARAMETRO construtor
        System.out.println("Digite uma cor");
        String cor = scanner.nextLine();
        System.out.println("Voce escolheu a cor " + cor);



//        if (idade < 16) {
//            System.out.println("NAO PODE VOTAR");
//            return;
//        }
//        if (idade < 18 || idade>70) {
//            System.out.println("O voto é OPCIONAL");
//            return;
//        }
//
//        System.out.println("Obrigatorio");
    }
}


/* Dado a variavel
int idade = 18
exiba na tela se o voto é
OBRIGATÓRIO
OPCIONAL
NÃO PODE VOTAR

Pessoas menores de 16 anos não podem votar
Pessoas entre 16 e 18 anos ou maiores de 70 anos tem o voto opcional
Pessoas entre 18 e 70 anos são obrigadas a votar*/

/*     if (idade < 16) {
            System.out.println("NAO PODE VOTAR");
        } else if (idade < 18 || idade>70) {
            System.out.println("O voto é OPCIONAL");
        }else {
            System.out.println("Obrigatorio");
        }*/