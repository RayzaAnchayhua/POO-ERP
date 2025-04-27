package com.willywonka.producao.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

// Entidade MateriaPrima
@Getter
@Setter
@Entity
public class MateriaPrima extends EntidadeBase {

    private String nome;
    private String unidadeMedida; // Ex: kg, litro, metro
}
