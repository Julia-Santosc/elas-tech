package Metodos;

public class AttSeis {
    static void main() {
        System.out.println( somar(5, 10) );
        System.out.println( somar(2, 4, 6) );
        System.out.println( somar(1.5, 2.5) );
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }

    static double somar(double a, double b) {
        return a + b;
    }



}

/*6 — Crie três métodos com o mesmo nome somar:

um que recebe dois inteiros
um que recebe três inteiros
um que recebe dois decimais

No main, chame os três e veja o Java escolher sozinho qual usar.*/