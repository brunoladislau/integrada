package com.bandtec.primeiraintegrada;

public class TesteMain {

    public static void main(String[] args) {

        Carrinho car = new Carrinho();

        ProdutoPeso p1 = new ProdutoPeso(123, "Grãos", "Nestle", 500.0, 100.0);
        ProdutoUnidade p2 = new ProdutoUnidade(456, "Abacaxi", "Frutaria", 3, 7.0);

        car.adicionarItem(p1);
        car.adicionarItem(p2);

        car.alterarQuantidade(p1, 300.0);
        car.alterarQuantidade(p2, 2.0);

        car.exibirItens();
    }
}
