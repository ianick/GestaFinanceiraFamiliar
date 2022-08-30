package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.controller;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.service.CadastroDeReceitaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/receitas")
public class CadastroDeReceitaController {

    private CadastroDeReceitaService cadastroService;

    @PostMapping("/receitas")
    public ResponseEntity<Object> newReceitas(@RequestParam String descricao, @RequestParam int valor, @RequestParam String  data) {
        return ResponseEntity.ok(cadastroService.newObject(descricao,valor,data));
    }
    @GetMapping("/receitas")
    public ResponseEntity<List> getAllReceitas() {
        return ResponseEntity.ok(cadastroService.getall());
    }

    @PutMapping("/receitas/{id}")
    public ResponseEntity<Object> updateReceitas(@PathVariable("name") String name) {
        return ResponseEntity.ok(cadastroService.updateToObject(name));
    }

    @DeleteMapping("/despesas/{id}")
    public ResponseEntity<Object> deleteReceitas(@PathVariable("id") String id) {
        return ResponseEntity.ok(cadastroService.removeObjectId(id));
    }




}
