package br.com.project.securitypractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.securitypractice.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
