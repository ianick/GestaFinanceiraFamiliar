package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.repository;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Receita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroDeReceitaRepository extends CrudRepository<Receita,String> {

        Optional<Receita> findByName(String name);
}
