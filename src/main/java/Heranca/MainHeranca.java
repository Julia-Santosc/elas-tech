package Heranca;
//        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

public class MainHeranca {
    public static void main(String[] args) {
        Aluna alunaUm = new Aluna();
        Professora professora = new Professora();
        Pessoa estagiaria = new Estagiaria();

        professora.disciplina = "Herança";
        professora.nome = "Julia";

        alunaUm.nome = "Bia";
        alunaUm.idade = 18;
        alunaUm.curso = "Java";

        estagiaria.idade = 19;
        estagiaria.nome = "Ana";

//        alunaUm.apresentar();
        alunaUm.estudar();

        professora.lancarNota(alunaUm.nome, 9.3333);

//        professora.apresentar();

//        estagiaria.apresentar();

        mostrarFicha(alunaUm);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);
    }

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}

//        Na Main, crie uma aluna e uma professora, preencha os atributos de
//cada objeto e chame os métodos das duas.
