package com.willywonka.producao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Classe que representa o item da produção
@Getter
@Setter
@Embeddable
public class ItemProducao {

    @ManyToOne
    private MateriaPrima materiaPrima;

    private Integer quantidade;
}
