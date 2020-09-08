package com.bandtec.primeiraintegrada;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<Produto>();
    }

    public void adicionarItem(Produto p){
        itens.add(p);
    }

    public void removerItem(Produto p){
        itens.remove(p);
    }

    public void exibirItens(){
        if (!itens.isEmpty()){
            for (Produto p : itens){
                System.out.println(p);
            }
        }
    }

    public void alterarQuantidade(Produto p, Double quantidade){
        if (p instanceof ProdutoPeso){
            ((ProdutoPeso) p).setQuantidadeGrama(quantidade);
        } else if (p instanceof  ProdutoUnidade){
            ((ProdutoUnidade) p).setQuantidadeUni(quantidade.intValue());
        }
    }

}
