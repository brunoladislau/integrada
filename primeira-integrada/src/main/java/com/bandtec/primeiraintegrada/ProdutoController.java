package com.bandtec.primeiraintegrada;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carrinho")

public class ProdutoController {

    private List<Produto> itens = new ArrayList<>();

    @GetMapping()
    public ResponseEntity listarItens(){
        if (!itens.isEmpty()){
            return ResponseEntity.ok().body(itens);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity buscarItem(@PathVariable int id){
        if (itens.size() >= id){
            return ResponseEntity.ok(itens.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/unidade")
    public ResponseEntity adicionarUni(@RequestBody ProdutoUnidade newProdUni){
        newProdUni.calcularPreco();
        itens.add(newProdUni);
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/peso")
    public ResponseEntity adicionarPeso(@RequestBody ProdutoPeso newProdPeso){
        newProdPeso.calcularPreco();
        itens.add(newProdPeso);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/remover/{id}")
    public ResponseEntity removerItem(@PathVariable int id){
        if (itens.size() >= id){
            itens.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
