package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.controller;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.service.CadastroDespesaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class CadastroDeDespesaController {

    private CadastroDespesaService cadastroService;

    @PostMapping("/despesa")
    @ResponseBody
    public ResponseEntity<Object> newDespesa(@RequestParam String descricao, @RequestParam int valor, @RequestParam String  data) {
        return ResponseEntity.ok(cadastroService.newObject(descricao,valor,data));
    }
    @GetMapping("/despesa")
    public ResponseEntity<List> getAllDespesas() {
        return ResponseEntity.ok(cadastroService.getall());
    }

    @PutMapping("/despesa/{id}")
    public ResponseEntity<Object> updateDespesas(@PathVariable("name") String name) {
        return ResponseEntity.ok(cadastroService.updateToObject(name));
    }

    @DeleteMapping("/despesa/{id}")
    public ResponseEntity<Object> deleteDespesas(@PathVariable("id") String id) {
        return ResponseEntity.ok(cadastroService.removeObjectId(id));
    }

}
