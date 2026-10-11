package Interfaces;

import java.util.ArrayList;

public class MainNotification {
    public static void main(String[] args) {

        ArrayList<Notificacao> listaDeNotificacoes = new ArrayList<>();

        listaDeNotificacoes.add(new Email());
        listaDeNotificacoes.add(new Sms());

        for (Notificacao item : listaDeNotificacoes) {

            System.out.println(item.enviar());

        }
    }
}



