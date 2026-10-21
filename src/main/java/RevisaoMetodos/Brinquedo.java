package RevisaoMetodos;

public class Brinquedo {
    public  String nome;
    public double tamanho;

    public static String verBrinquedo(Brinquedo brinquedo){
        return "O brinquedo escolhido foi: " + brinquedo.nome;
    }
}
