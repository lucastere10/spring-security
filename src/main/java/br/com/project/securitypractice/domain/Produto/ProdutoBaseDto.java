package br.com.project.securitypractice.domain.Produto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ProdutoBaseDto {

    private String produtoNome;
    
    private String produtoDescricao;

}
