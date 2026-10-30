package lambda2;

public class Main {
    static  void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }


    static void executarSe(Condicao cond, int valor, Acao acao) { if (cond.testar(valor)) {
        acao.executar();
    }
    }

    //Main
    public static void main(String[] args) {


        mostrarResultado((valor)-> valor * 2, 5);
        mostrarResultado((valor)-> valor * 3, 3);
        mostrarResultado((valor) -> valor - 3, - 5);

        repetirAcao(() -> System.out.println("Oi"));

        executarSe((n) -> n%2 == 0, 4, () -> System.out.println("É par! "));

    }
}


