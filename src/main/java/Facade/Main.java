//package Facade;
//
//public class Main {
//        public static void main(String[] args) {
//
//            //SEM FACADE
//            Estoque estoque = new Estoque();
//            Cobranca cobranca = new Cobranca();
//            NotaFiscal notaFiscal = new NotaFiscal();
//            Entrega entrega = new Entrega();
//
//            estoque.darBaixa();
//            cobranca.cobrar();
//            notaFiscal.emitir();
//            entrega.agendar();
//
//
//            // DEPOIS DO FACADE
//            CompraFacade compra = new CompraFacade();
//            compra.finalizarCompra();
//
//
//        }
//    }
