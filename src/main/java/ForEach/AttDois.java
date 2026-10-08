package ForEach;

import java.util.ArrayList;

//2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
    public class AttDois {
        public static void main(String[] args) {

            ArrayList<Double> notas = new ArrayList<>();

            //Colocando as 5 notas lá dentro usando o .add()
            notas.add(8.5);
            notas.add(7.0);
            notas.add(9.2);
            notas.add(6.5);
            notas.add(10.0);

            // Imprimindo com o for-each (A lógica é idêntica à do Array normal!)
            // Para cada 'nota' do tipo Double dentro da lista 'notas', faça:
            for (Double nota : notas) {
                System.out.println(nota);
            }
        }
    }


