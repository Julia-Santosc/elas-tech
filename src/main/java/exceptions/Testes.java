package exceptions;

public class Testes {
    static void main() {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");
        }
        finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua.");
    }
}