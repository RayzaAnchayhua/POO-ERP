package com.willywonka.service;

import com.willywonka.producao.model.Producao;
import com.willywonka.repository.ProducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducaoService implements GenericService<Producao> {

    @Autowired
    private ProducaoRepository repository;

    @Override
    public List<Producao> listar() {
        return repository.findAll();
    }

    @Override
    public Producao salvar(Producao producao) {
        return repository.save(producao);
    }

    @Override
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Producao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
