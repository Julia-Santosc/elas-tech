package EstruturasDeDecisao;

public class AtividadeDois {
    static void main() {
        double saldoConta = 500.00;
        double valorCompra = 320.00;

        if (saldoConta >= valorCompra) {
            double saldoRestante = saldoConta - valorCompra;
            System.out.println("Compra aprovada!");
            System.out.printf("Saldo restante: R$ %.2f ", saldoRestante);
        } else {
            double valorFaltante = valorCompra - saldoConta;
            System.out.println("Saldo insuficiente.");
            System.out.printf("Falta: R$ %.2f ", valorFaltante);
        }
    }
}


/* Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.*/

