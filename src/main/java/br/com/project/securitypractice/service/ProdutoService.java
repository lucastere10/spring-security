package br.com.project.securitypractice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.securitypractice.domain.Produto.ProdutoBaseDto;
import br.com.project.securitypractice.domain.Produto.ProdutoResponseDto;
import br.com.project.securitypractice.model.Produto;
import br.com.project.securitypractice.repository.ProdutoRepository;
import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ModelMapper mapper;

    // CRUD

    // Create
    @Transactional
    public ProdutoResponseDto create(ProdutoBaseDto produtoRequest) {
        Produto produtoModel = mapper.map(produtoRequest, Produto.class);

        produtoModel = produtoRepository.save(produtoModel);
        return mapper.map(produtoModel, ProdutoResponseDto.class);
    }

    // FindAll
    public List<ProdutoResponseDto> findAll() {
        List<Produto> produtos = produtoRepository.findAll();

        return produtos.stream().map(produto -> mapper.map(produto, ProdutoResponseDto.class))
                .collect(Collectors.toList());
    }

}
