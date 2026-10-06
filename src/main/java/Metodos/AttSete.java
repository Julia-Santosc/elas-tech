package Metodos;

public class AttSete {
    static void main() {
        saudacao();
        saudacao("Joao");
    }

    static void saudacao(){
        System.out.println("Olá");
    }

    static void saudacao(String nome){
        System.out.println("Olá, " + nome);
    }
}


//7 — Crie dois métodos chamados saudacao:
//
//um sem parâmetro, que imprime "Olá!"
//um que recebe um nome, e imprime "Olá, [nome]!"