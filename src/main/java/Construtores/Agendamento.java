package Construtores;

import java.util.HashMap;
import java.util.Map;

public class Agendamento {

    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public Agendamento(
            String nomePet,
            String servico,
            String horario,
            boolean perfume,
            boolean laco,
            boolean hidratacao,
            String observacao,
            double desconto
    ) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println();
    }
}
        // quando quer nenhum/0, escrever sem nenhum extra
        // quando quer 2, escrever com x e y, sem z
        // quando quer somente 1, escrever só com x

        // perfume, laco, hidratacao

        // como ver 3 booleans, quando todos sao falsos!?
        // perfume falso E laco falso E hidratacao falso -> o cara n quer extra

        // como ver que ele quer pelo menos 1 extra
        // pelo menos um dos 3 tem que ser verdadeiro
        // pefume verdadeiro OU laco verdadeiro OU hidratacao verdadeiro


        // como ver que ele quer 2 extras, nao 3, nao um

