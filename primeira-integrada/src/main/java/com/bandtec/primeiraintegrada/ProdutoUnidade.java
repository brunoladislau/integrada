package com.bandtec.primeiraintegrada;

public class ProdutoUnidade extends Produto {

    private Integer quantidadeUni;
    private Double precoUni;

    public ProdutoUnidade(Integer codigo, String nome, String fabricante, Integer quantidadeUni, Double precoUni) {
        super(codigo, nome, fabricante);
        this.quantidadeUni = quantidadeUni;
        this.precoUni = precoUni;
    }

    @Override
    public Double calcularPreco() {
        return quantidadeUni * precoUni;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Quantidade (Un.): " + quantidadeUni +
                " | Preço (Un.): R$" + precoUni +
                "\nTotal: R$" + calcularPreco();
    }

    public Integer getQuantidadeUni() {
        return quantidadeUni;
    }

    public void setQuantidadeUni(Integer quantidadeUni) {
        this.quantidadeUni = quantidadeUni;
    }

    public Double getPreçoUni() {
        return precoUni;
    }

    public void setPreçoUni(Double preçoUni) {
        this.precoUni = preçoUni;
    }
}
