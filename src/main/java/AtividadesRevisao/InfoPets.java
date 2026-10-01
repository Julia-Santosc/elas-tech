package AtividadesRevisao;

public class InfoPets {
    static void main() {

        Pet cachorro = new Pet();
        Pet gato = new Pet();

        cachorro.nome = "Toby";
        cachorro.peso = 9 ;
        cachorro.raca = "Collie";

        gato.raca = "Siamês";
        gato.peso = 6;
        gato.nome = "Sheyla";

        System.out.println("O cachorro se chama: " + cachorro.nome
                            + "\nE pesa " + cachorro.peso + " kg "
                            + "\nE é da raça: " + cachorro.raca);

        System.out.println("\nO gato se chama " + gato.nome
                            + "\nE pesa " + gato.peso + "kg"
                            + "\nE é da raça: " + gato.raca);

    }
}




//Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
//
//Atribua valores para os atributos de cada um deles.
//
//Imprima os dados dos dois pets concatenando textos e variáveis.