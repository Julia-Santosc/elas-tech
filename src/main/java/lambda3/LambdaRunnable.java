package lambda3;

public class LambdaRunnable {
    public static void main(String[] args) {

        //Runnable não recebe nada, não devolve nada.
        Runnable acao = () -> System.out.println("Executando tarefa.");
        acao.run();

        Runnable acaoDois = () -> System.out.println("Executando segunda tarefa.");
        acao.run();
        acaoDois.run();
    }
}
