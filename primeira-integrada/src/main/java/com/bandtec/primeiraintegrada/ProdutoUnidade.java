package com.bandtec.primeiraintegrada;

public class ProdutoUnidade extends Produto {

    private Integer quantidadeUni;
    private Double preçoUni;

    public ProdutoUnidade(Integer codigo, String nome, String fabricante, Integer quantidadeUni, Double preçoUni) {
        super(codigo, nome, fabricante);
        this.quantidadeUni = quantidadeUni;
        this.preçoUni = preçoUni;
    }

    @Override
    public Double calcularPreco() {
        return quantidadeUni * preçoUni;
    }

    @Override
    public String toString() {
        return "ProdutoUnidade{" +
                "quantidadeUni=" + quantidadeUni +
                ", preçoUni=" + preçoUni + calcularPreco() +
                "} " + super.toString();
    }

    public Integer getQuantidadeUni() {
        return quantidadeUni;
    }

    public void setQuantidadeUni(Integer quantidadeUni) {
        this.quantidadeUni = quantidadeUni;
    }

    public Double getPreçoUni() {
        return preçoUni;
    }

    public void setPreçoUni(Double preçoUni) {
        this.preçoUni = preçoUni;
    }
}
