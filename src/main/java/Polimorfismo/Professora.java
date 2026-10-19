package Polimorfismo;

public class Professora extends Pessoa{
    String disciplina;

    void lancarNota(double nota, String nome){
        System.out.printf("Flora lançou nota %.1f  Para %s.",nota, nome);
    }
}
