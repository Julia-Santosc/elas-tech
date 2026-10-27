package Observer;

import java.util.ArrayList;

public class Estoque {
    int quantidade;

    ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

     void adicionarObservador(ObservadorEstoque obs) {
         observadores.add(obs);
     }

     void setQuantidade(int NovaQuantidade){
         this.quantidade = NovaQuantidade;

         for (ObservadorEstoque obs : observadores) {
             obs.atualizar(this.quantidade);
         }

     }
}
