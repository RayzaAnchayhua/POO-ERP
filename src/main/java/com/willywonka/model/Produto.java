package com.willywonka.producao.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

// Entidade Produto
@Getter
@Setter
@Entity
public class Produto extends EntidadeBase {

    private String nome;
    private Double preco;
}
