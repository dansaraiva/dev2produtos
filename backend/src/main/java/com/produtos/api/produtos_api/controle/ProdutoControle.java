package com.produtos.api.produtos_api.controle;

import org.springframework.web.bind.annotation.RestController;

import com.produtos.api.produtos_api.modelo.ProdutoModelo;
import com.produtos.api.produtos_api.servico.ProdutoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProdutoControle {

    @Autowired
    ProdutoServico ps;

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!!!";
    }
    
    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return ps.listar();
    }

}
