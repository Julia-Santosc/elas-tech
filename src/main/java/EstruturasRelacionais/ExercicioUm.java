package EstruturasRelacionais;

public class ExercicioUm {
    public static void main() {

         int primeiraNota = 9;
         int segundaNota = 4;

        System.out.println("A primeira nota é: " + primeiraNota + ", A segunda nota é: " + segundaNota);

        if (primeiraNota == segundaNota) {
           System.out.println("As notas são IGUAIS.");
        } else {
           System.out.println("As notas são DIFERENTES.");

           if (primeiraNota > segundaNota) {
               System.out.println("A primeira nota é MAIOR que a segunda nota.");
           } else {
               System.out.println("A primeira nota é MENOR que a segunda nota.");
           }
        }

    }
}

