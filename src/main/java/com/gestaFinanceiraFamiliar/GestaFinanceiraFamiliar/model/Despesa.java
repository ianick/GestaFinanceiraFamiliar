package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;
@Setter
@Getter
@Entity
@Table(name = "despesa")
public class Despesa extends Cadastro{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    public Despesa(String descricao, int valor, String data, UUID id) {
        super(descricao, valor, data);
        this.id=id;

    }

    @Override
    public boolean equals(Object o){

        if(this==o)return true;
        if(o!=null || o.getClass()!= getClass()) return false;

        Despesa despesa = (Despesa) o;
        return Objects.equals(id, despesa.id);

    }
}
