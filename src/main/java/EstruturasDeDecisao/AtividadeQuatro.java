package EstruturasDeDecisao;

public class AtividadeQuatro {
    static void main() {
        int idade = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao == true) {
            System.out.println("Acesso liberado");
        }else {
            System.out.println("voce nao esta autorizado a entrar na festa.");
        }
    }
}
