package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.service;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.cadastroApi.CadastroAPI;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Receita;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Storage;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.repository.CadastroDeReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroDeReceitaService implements CadastroAPI {

    private CadastroDeReceitaRepository cadastroDeReceitaRepository;
    @Override
    public Object newObject(String descrição, int valor, String data) {
//        if(descrição!=null&&data!=null){
//            Receita receitas = new Receita(descrição,valor,data);
//            cadastroDeReceitaRepository.save(receitas);
//            Storage.getInstance().setCadastros(receitas);
//            return receitas.getData();
//        }
        return null;
    }

    @Override
    public List getall() {
        return null;
    }

    @Override
    public String updateToObject(String name) {
        return null;
    }

    @Override
    public String removeObjectId(String id) {
        return null;
    }

}
