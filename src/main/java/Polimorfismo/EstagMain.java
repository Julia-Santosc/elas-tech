package Polimorfismo;

public class EstagMain {
    public static void main(String[] args) {
        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Julia";
        estagiaria.idade = 27;

        estagiaria.apresentar(estagiaria.nome, estagiaria.idade);
    }


}
