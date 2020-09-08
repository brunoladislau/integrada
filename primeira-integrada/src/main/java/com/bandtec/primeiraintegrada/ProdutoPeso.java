package com.bandtec.primeiraintegrada;

public class ProdutoPeso extends Produto {

    private Double quantidadeGrama;
    private Double precoKilo;

    public ProdutoPeso(Integer codigo, String nome, String fabricante, Double quantidadeGrama, Double precoKilo) {
        super(codigo, nome, fabricante);
        this.quantidadeGrama = quantidadeGrama;
        this.precoKilo = precoKilo;
    }

    @Override
    public Double calcularPreco() {
        return quantidadeGrama * precoKilo / 1000;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Quantidade (g): " + quantidadeGrama +
                " | Preço (Kg): R$" + precoKilo +
                "\nTotal: R$" + calcularPreco();
    }

    public Double getQuantidadeGrama() {
        return quantidadeGrama;
    }

    public void setQuantidadeGrama(Double quantidadeGrama) {
        this.quantidadeGrama = quantidadeGrama;
    }

    public Double getPrecoKilo() {
        return precoKilo;
    }

    public void setPrecoKilo(Double precoKilo) {
        this.precoKilo = precoKilo;
    }
}
