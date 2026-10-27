package Observer;

import java.util.ArrayList;

public class Voo {
    ArrayList<ObservadorVoo> observador = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o){
        observador.add(o);
    }

    public void mudar (String status){
        for (ObservadorVoo o : observador) {
            o.atualizar(status);
        }

    }
}
