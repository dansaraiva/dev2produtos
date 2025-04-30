package com.produtos.api.produtos_api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProdutoControle {

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
}
