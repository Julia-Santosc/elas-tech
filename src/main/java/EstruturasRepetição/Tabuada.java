package EstruturasRepetição;

//4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

public class Tabuada {
    static void main() {
        int num = 5;
        int contador = 1;
        while (contador <= 10) {
            System.out.println(num + "x" + contador + "=" + num * contador);

            contador++;
        }
    }
}
