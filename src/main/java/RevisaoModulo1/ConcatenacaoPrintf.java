package RevisaoModulo1;

public class ConcatenacaoPrintf {
    public static void main(String[] args) {
        // Nome e idade em uma frase
        String nome = "Julia";
        int idade = 22;
        System.out.println(nome + " tem " + idade + " anos.");

        // Media de duas notas com duas casas decimais
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f%n", media);

        // Preço de um produto com duas casas decimais
        double preco = 59.9;
        System.out.printf("Preço do produto: R$ %.2f%n", preco);

        // Nome, idade e altura em uma linha só

        String nome2 = "Julia";
        int idade2 = 22;
        double altura = 1.74;
        System.out.printf("Nome: %s | Idade: %d anos | Altura: %.2fm%n", nome2, idade2, altura);

        // Mini-desafio

        String produto1 = "Arroz";
        double preco1 = 5.50;

        String produto2 = "Feijão";
        double preco2 = 7.90;

        String produto3 = "Óleo";
        double preco3 = 8.49;

        // Variável começando em zero
        double total = 0.0;

        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        total += preco1;

        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        total += preco2;

        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        total += preco3;

        System.out.printf("Total a pagar: R$ %.2f%n", total);




    }
}
