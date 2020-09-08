package com.bandtec.primeiraintegrada;

public abstract class Produto {

    private Integer codigo;
    private String nome;
    private String fabricante;

    public Produto(Integer codigo, String nome, String fabricante) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public abstract Double calcularPreco();

    @Override
    public String toString() {
        return "-- Produto\n" +
                "Código: " + codigo +
                " | Nome: " + nome +
                " | Fabricante: " + fabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
