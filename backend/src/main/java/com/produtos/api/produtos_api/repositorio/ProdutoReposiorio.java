package com.produtos.api.produtos_api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.produtos.api.produtos_api.modelo.ProdutoModelo;

@Repository
public interface ProdutoReposiorio extends CrudRepository<ProdutoModelo, Long>{

    
}
