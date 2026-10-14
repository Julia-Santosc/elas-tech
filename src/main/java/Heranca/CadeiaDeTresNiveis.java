package Heranca;

public class CadeiaDeTresNiveis {
    public static void main(String[] args) {
        Diretora diretora = new Diretora();

        diretora.nome = "Julia";

        diretora.definirMeta("200 alunos.");
        diretora.aprovarFerias("Maria");
        diretora.baterPonto();

        Gerente gerente = new Gerente();
        gerente.nome = "Joao";

        gerente.aprovarFerias("Victor");
        gerente.baterPonto();
        gerente.exportar();
        gerente.notificar("Ola");

    }
}


//6. Crie duas interfaces:
//        - Notificavel, com notificar(String mensagem)
//   - Exportavel, com exportar()
//Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
//   extends Funcionario:
//class Gerente extends Funcionario implements Notificavel, Exportavel
//    Na Main, crie um gerente, preencha o nome e chame os quatro
//            métodos nele: baterPonto(), aprovarFerias(), notificar()
//e exportar().
