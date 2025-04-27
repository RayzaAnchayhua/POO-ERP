package com.willywonka.repository;

import com.willywonka.producao.model.EntidadeBase;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface genérica para repositórios
public interface GenericRepository<T extends EntidadeBase> extends JpaRepository<T, Long> {
}
