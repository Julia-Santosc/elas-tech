package ExerciciosComJoao;

public class Bolo {
    public String sabor;
    public String formato;
    double preco;
    boolean ehDeHoje;
    boolean decorado;

    public void informacoesDoBolo() {
        if (decorado == true) {
            System.out.println("Seu bolo ESTA decorado");
        } else {
            System.out.println("Seu bolo NAO FOI decorado");
        }

        System.out.println("O sabor do seu bolo é: " + sabor);

        System.out.println("O formato do seu bolo é: " + formato);

        if (ehDeHoje) {
            System.out.println("SIM, seu Bolo é de hoje");
        } else {
            System.out.println("Seu bolo NÃO é de hoje.");
        }

        double precoComDesconto = preco - 10;

        System.out.println("O preco do seu bolo é:" + precoComDesconto);
    }
    //faca um metodo que retorne de forma amigavel na mensagem
    // se o bolo ~e decorado, se eh de hoje, seu formato, preco com desconto de 10 reais e o sabor

}
