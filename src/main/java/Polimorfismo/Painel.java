package Polimorfismo;

public class Painel {
        // Metodo que recebe String.
        public void exibir(String texto) {
            System.out.println("Recebi um texto: " + texto);
        }

        // Metodo que recebe int.
        public void exibir(int numero) {
            System.out.println("Recebi um número inteiro: " + numero);
        }

        // Metodo que recebe boolean.
        public void exibir(boolean valor) {
            System.out.println("Recebi um valor booleano: " + valor);
        }

        // Metodo que recebe double
        public void exibir(double decimal) {
            System.out.println("Recebi um número decimal: " + decimal);
        }

        // Metodo Principal
        public static void main(String[] args) {
            // Criamos o nosso robô chamado 'meuPainel'
            Painel meuPainel = new Painel();

            // Chamando o metodo exibir quatro vezes com tipos diferentes
            meuPainel.exibir("Olá, turminha!");
            meuPainel.exibir(42);
            meuPainel.exibir(true);
            meuPainel.exibir(3.14);
        }
    }
