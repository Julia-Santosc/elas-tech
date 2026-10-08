package Metodos;
//2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.

public class AttDois {
    static void main() {
        saudar("Jose");
        saudar("Julia");
        saudar("Joao");

    }
    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");

    }
}
