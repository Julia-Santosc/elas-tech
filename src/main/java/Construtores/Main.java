package Construtores;

public class Main {
    public static void main(String[] args) {
        Agendamento agendamentoThor = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10);
        Agendamento agendamentoLuna = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0);
        Agendamento agendamentoMel = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0);

        agendamentoThor.mostrar();
        agendamentoLuna.mostrar();
        agendamentoMel.mostrar();
    }
}
