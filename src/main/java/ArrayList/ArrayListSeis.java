package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
public class ArrayListSeis {
    static void main() {

        ArrayList<String> lista = new ArrayList<String>(List.of("Ana","Sofia","Bianca","Julia","Beatriz"));
        System.out.println("Olá, digite o seu nome para verificar se está na lista : ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        if (lista.contains(nome)) {
            System.out.println("Seu nome está na lista!");
        }
        else {
            System.out.println("O nome " + nome + " não foi encontrado na lista! ");
        }

    }
}