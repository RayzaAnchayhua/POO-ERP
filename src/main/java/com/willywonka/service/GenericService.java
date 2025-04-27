package com.willywonka.service;

import com.willywonka.producao.model.EntidadeBase;
import java.util.List;

// Interface de serviço genérica
public interface GenericService<T extends EntidadeBase> {

    List<T> listar();

    T salvar(T entidade);

    void excluir(Long id);

    T buscarPorId(Long id);
}
