package Interfaces;

public class Email implements Notificacao{

    @Override
    public String enviar() {
        return " E-mail enviado: Sua compra foi aprovada!";
    }
}
