package Factory;

public class MySql implements BancoDeDados{
    int opcap = 2;

    @Override
    public String chamarBanco() {

        return "Seja bem vindo ao MySQL.";
    }

    @Override
    public int getNumero() {

        return 0;
    }
}
