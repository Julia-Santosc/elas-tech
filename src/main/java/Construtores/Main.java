package Construtores;

public class Main {
    public static void main(String[] args) {
//        Agendamento agendamentoThor = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10);
//        Agendamento agendamentoLuna = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0);
//        Agendamento agendamentoMel = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0);

        Agendamento agendamentoThor = new Agendamento.AgendamentoBuilder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("Alérgico a shampoo")
                .desconto(10)
                .build();

        Agendamento agendamentoLuna = new Agendamento.AgendamentoBuilder()
                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .observacao("")
                .desconto(0)
                .build();

        Agendamento agendamentoMel = new Agendamento.AgendamentoBuilder()
                .nomePet("Mel")
                .servico("Banho")
                .horario("16h")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .observacao("")
                .desconto(0)
                .build();

        agendamentoThor.mostrar();
        agendamentoLuna.mostrar();
        agendamentoMel.mostrar();
    }
}
