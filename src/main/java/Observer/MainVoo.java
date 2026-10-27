package Observer;

public class MainVoo {
    public static void main(String[] args) {

        Voo meuVoo = new Voo();

        //criando observadores
        Passageiro passageiro1 = new Passageiro();
        PainelAeroporto painelAeroporto = new PainelAeroporto();

        //adicionando os observadores no voo
        meuVoo.adicionarObservador(passageiro1);
        meuVoo.adicionarObservador(painelAeroporto);

        //mudando status
        System.out.println("Atualizacao 1");
        meuVoo.mudar("Embarque iniciado");

        // Mudando o status para "Atrasado" (os dois tem que ser avisadoso)
        System.out.println("Atualizacao 2");
        meuVoo.mudar("Atrasado");

    }
}
