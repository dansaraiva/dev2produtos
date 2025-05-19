package com.produtos.api.produtos_api.controle;

import org.springframework.web.bind.annotation.RestController;

import com.produtos.api.produtos_api.modelo.ProdutoModelo;
import com.produtos.api.produtos_api.servico.ProdutoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!!!";
    }
    
    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return ps.listar();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
        return ps.cadastrarAlterar(pm, "cadastrar");
    }
     @PutMapping("/alterar")
    public ResponseEntity<?> cadastrarAlterar(@RequestBody ProdutoModelo pm){
        return ps.cadastrarAlterar(pm, "alterar");
    }

}
