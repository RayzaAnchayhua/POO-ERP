
package com.willywonka.producao.model;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
public class Fornecedor extends EntidadeBase {
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
}

