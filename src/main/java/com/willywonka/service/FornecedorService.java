package com.willywonka.service;

import com.willywonka.producao.model.Fornecedor;
import com.willywonka.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Serviço para Fornecedor
@Service
public class FornecedorService implements GenericService<Fornecedor> {

    @Autowired
    private FornecedorRepository repository;

    @Override
    public List<Fornecedor> listar() {
        return repository.findAll();
    }

    @Override
    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    @Override
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Fornecedor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
