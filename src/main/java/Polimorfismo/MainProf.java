package Polimorfismo;

public class MainProf {
    static void mostrarFicha(Pessoa p) {
        p.apresentar(p.nome, p.idade);
    }
    public static void main(String[] args)
    {
        Professora prof = new Professora();
            prof.nome = "Flora";
            prof.idade = 27;
            prof.disciplina = "Java";

            Aluna alun2 = new Aluna();
            alun2.nome = "Julia";
            alun2.idade = 33;

//            prof.lancarNota(9.5, alun2.nome);
//            alun2.estudar();

            prof.apresentar(prof.nome, prof.idade);

            alun2.apresentar(alun2.nome, alun2.idade);

            alun2.apresentar("julia", 33);

    }
}
