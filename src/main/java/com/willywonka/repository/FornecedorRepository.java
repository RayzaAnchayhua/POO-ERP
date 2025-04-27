package com.willywonka.repository;

import com.willywonka.producao.model.Fornecedor;
import org.springframework.stereotype.Repository;

// Repositório específico para Fornecedor
@Repository
public interface FornecedorRepository extends GenericRepository<Fornecedor> {
}
