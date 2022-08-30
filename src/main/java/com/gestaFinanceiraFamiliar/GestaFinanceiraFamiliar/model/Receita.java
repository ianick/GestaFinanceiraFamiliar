package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;
@Setter
@Getter
@Entity
@Table(name = "receita")
public class Receita extends Cadastro{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private UUID id;

   public Receita(String descricao, int valor, String data) {
      super(descricao, valor, data);
   }
}
