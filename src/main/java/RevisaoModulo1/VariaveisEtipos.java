package RevisaoModulo1;

public class VariaveisEtipos {
    public static void main(String[] args) {
        String nome = "Julia";
        int idade = 22;
        double altura = 1.74;
        boolean jaProgramou = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Já programou antes? " + jaProgramou);

        System.out.println("-------------------");

        String cidade = "Canas";
        System.out.println("Eu moro em " + cidade + ".");

        String primeiroNome = "Julia";
        String sobrenome = "Santos";
        System.out.println(primeiroNome + " " + sobrenome);

        double preco = 29.90;
        System.out.println("O valor do produto é R$ " + preco);

        boolean temCarteira = true;
        System.out.println("Tem carteira de motorista? " + temCarteira);


        //Mini-desafio

        int a = 10;
        int b = 20;

        System.out.println("Antes da troca: a = " + a + ", b = " + b);

        int troca = a;
        a = b;

        b = troca;

        System.out.println("Depois da troca: a = " + a + ", b = " + b);
    }
}
