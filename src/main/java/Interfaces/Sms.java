package Interfaces;

public class Sms implements Notificacao{
    @Override
    public String enviar() {

        return " SMS enviado: Sua compra foi aprovada!";
    }
}
