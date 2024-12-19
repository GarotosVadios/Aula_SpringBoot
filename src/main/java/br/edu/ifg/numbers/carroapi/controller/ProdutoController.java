package com.example.produto.controller;

import com.example.produto.model.Produto;
import com.example.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/<built-in function id>")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @DeleteMapping("/<built-in function id>")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}


