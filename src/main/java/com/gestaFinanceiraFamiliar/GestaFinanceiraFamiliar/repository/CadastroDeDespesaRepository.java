package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.repository;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Despesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroDeDespesaRepository extends CrudRepository<Despesa,String> {

  Optional<Despesa>  findByName(String name);
}
