package EstruturasDeDecisao;

public class Desafio {
    static void main() {

        double nota1 = 5.3;

        double nota2 = 4.2;

        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        }else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
