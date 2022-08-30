package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model;

import lombok.*;

import javax.persistence.Column;
@Setter
@Getter
public abstract class Cadastro {
    @Column(name = "descricao")
    private  String descricao;
    @Column(name = "data")
    private String data;
    @Column(name = "valor")
    private  int valor;
    public Cadastro(String descricao, int valor, String data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
}
