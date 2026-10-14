package Heranca;
//        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

public class MainHeranca {
    public static void main(String[] args) {
        Aluna alunaUm = new Aluna();
        Professora professora = new Professora();

        professora.disciplina = "Herança";
        professora.nome = "Julia";

        alunaUm.nome = "Bia";
        alunaUm.idade = 18;
        alunaUm.curso = "Java";

        alunaUm.apresentar();
        alunaUm.estudar();

        professora.lancarNota(alunaUm.nome, 9.3333);

        professora.apresentar();
    }
}

//        Na Main, crie uma aluna e uma professora, preencha os atributos de
//cada objeto e chame os métodos das duas.
