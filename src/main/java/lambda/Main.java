package lambda;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("Oi");
        saudacao.executar();

        Impressora impressoraMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        Impressora impressoraMinusculo = (texto) -> System.out.println(texto.toLowerCase());

        impressoraMaiusculo.imprimir("Boa noite");
        impressoraMinusculo.imprimir("Boa noite");

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maiorQue = (a, b) -> Math.max(a,b);

        System.out.println(soma.calcular(25, 25));
        System.out.println(multiplicacao.calcular(2, 5));
        System.out.println(maiorQue.calcular(80, 22));
    }
}
//Interface Calcular com int calcular(int a, int b).
//Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.