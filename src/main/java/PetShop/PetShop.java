package PetShop;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        String nome = "";
        String especie = "";
        double peso = 0;
        String porte = "";

        if (peso >= 10) {
            System.out.println("Porte: pequeno. ");
        }
        if (peso > 10 && peso < 25) {
            System.out.println("Porte: Médio. ");
        }else {
            System.out.println("Porte: Grande. ");
        }

        System.out.printf("=== FICHA DO PET ===\n" +
                            "Nome: ", nome + "\n" +
                            "Espécie: ", especie + "\n" +
                            "Peso: %.1f", peso);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do animal: ");
        nome = sc.nextDouble();

        System.out.println("Digite a espécie : ");
        especie = sc.nextLine();

        System.out.println("Digite o peso : ");
        peso = sc.nextInt();

    }
}