package com.produtos.api.produtos_api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.api.produtos_api.modelo.ProdutoModelo;
import com.produtos.api.produtos_api.repositorio.ProdutoReposiorio;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoReposiorio pr;


    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }
}
