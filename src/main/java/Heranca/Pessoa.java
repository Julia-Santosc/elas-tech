package Heranca;

public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Oi, sou " + nome +  " e tenho " + idade + " anos.");
    }
}




//    1. Crie a classe Pessoa com os atributos nome e idade, e o método
//apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
//Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
//
//
//Repare: você não escreveu nome, idade nem apresentar() na Aluna,
//e os três funcionaram.