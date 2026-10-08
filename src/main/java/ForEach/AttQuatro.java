package ForEach;
//4. Com um array de nomes, use for-each e um if para contar quantos
//têm mais de 5 letras. Mostre o total. Dica: usem o método length.
public class AttQuatro {
    static void main() {
        String[] nomes = {"Matilde", "Ferdinanda", "Julia", "Maria", "Alice"};
        int contaNomes = 0;

        for(String nome : nomes) {

            if(nome.length() > 5) {
                contaNomes++;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + contaNomes);

    }
}
