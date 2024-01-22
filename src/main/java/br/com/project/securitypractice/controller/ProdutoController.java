package br.com.project.securitypractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.securitypractice.domain.Produto.ProdutoBaseDto;
import br.com.project.securitypractice.domain.Produto.ProdutoResponseDto;
import br.com.project.securitypractice.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    // CREATE
    @PostMapping
        public ResponseEntity<ProdutoResponseDto> create(@RequestBody ProdutoBaseDto produto) {

        return ResponseEntity
                .status(201)
                .body(produtoService.create(produto));
    }

    // FIND ALL
    @GetMapping
    public ResponseEntity<List<ProdutoResponseDto>> findAll() {
        return ResponseEntity
                .status(200)
                .body(produtoService.findAll());
    }


}
