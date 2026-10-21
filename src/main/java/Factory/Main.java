package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o banco voce deseja utilizar? Digite: \n 1 - MySql \n 2 - MongoDb");
        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
        banco.chamarBanco();

    }
}
