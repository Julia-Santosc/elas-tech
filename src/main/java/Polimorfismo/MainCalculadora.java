package Polimorfismo;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double q = calc.calcularArea(5.0);          // Quadrado
        double r = calc.calcularArea(4.0, 3.0);     // Retângulo
        double c = calc.calcularArea(3);            // Círculo

        System.out.println("Área do quadrado: " + q);
        System.out.println("Área do retângulo: " + r);
        System.out.println("Área do círculo: " + c);
    }

}
