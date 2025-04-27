package com.willywonka.controller;

import com.willywonka.producao.model.Producao;
import com.willywonka.service.ProducaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producoes")
public class ProducaoController {

    @Autowired
    private ProducaoService service;

    @GetMapping
    public List<Producao> listar() {
        return service.listar();
    }

    @PostMapping
    public Producao salvar(@RequestBody Producao producao) {
        return service.salvar(producao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @GetMapping("/{id}")
    public Producao buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
