package lambda3;

import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {

        //Predicate entra algo, sai boolean.
        Predicate<Integer> eMaiorQueDez = numero -> numero > 10;

        System.out.println("5 é maior que 10? " + eMaiorQueDez.test(5));
        System.out.println("15 é maior que 10? " + eMaiorQueDez.test(15));

        Predicate<String> eVazio = (texto) -> texto.isEmpty();

        System.out.println("''está vazio? " + eVazio.test(""));
        System.out.println("'Java' está vazio? " + eVazio.test("Java"));
    }
}

