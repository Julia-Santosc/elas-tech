package Heranca;

public class Professora extends Pessoa {
    String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s.\n", nome, nota, aluna);
    }
    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}

//    @Override
//    public void apresentar(){
//        System.out.printf("Oi, sou %s e ensino %s.\n", nome, disciplina);
//    }
//}



//4. Na Professora, sobrescreva o apresentar() usando @Override, pra
//imprimir "Oi, sou [nome] e ensino [disciplina]."
//
//Chame apresentar() na aluna e na professora e compare as saídas.


//3. Crie a classe Professora, também filha de Pessoa, com o atributo
//disciplina e o método lancarNota(String aluna, double nota), que
//imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
//com %.1f.
//
