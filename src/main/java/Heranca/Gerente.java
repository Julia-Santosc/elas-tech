package Heranca;

public class Gerente extends Funcionario implements Exportavel, Notificavel{

    @Override
    public void exportar(){
        System.out.println("Exportando");;
    }


    @Override
    public void notificar(String mensagem) {
        System.out.println("Mensagem : " + mensagem);
    }

    public void aprovarFerias(String quem)  {
        System.out.println("Aprovando ferias de : " + quem);
    }
}
