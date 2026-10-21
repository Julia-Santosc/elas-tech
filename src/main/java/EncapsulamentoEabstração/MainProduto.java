package EncapsulamentoEabstração;

public class MainProduto {
    public static void main(String[] args) {
        Produto boneca = new Produto();

        System.out.println(boneca.preco);
        System.out.println(boneca.nome);
        System.out.println(boneca.getCodigoInterno());
    }
}
