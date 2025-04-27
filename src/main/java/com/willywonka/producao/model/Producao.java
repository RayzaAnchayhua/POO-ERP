package com.willywonka.producao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

// Entidade Producao
@Getter
@Setter
@Entity
public class Producao extends EntidadeBase {

    private LocalDate dataProducao;

    @ManyToOne
    private Produto produto;

    @ElementCollection
    private List<ItemProducao> itens;
}
