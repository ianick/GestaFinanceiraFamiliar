package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.service;

import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.cadastroApi.CadastroAPI;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Despesa;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model.Storage;
import com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.repository.CadastroDeDespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CadastroDespesaService implements CadastroAPI {

    private CadastroDeDespesaRepository cadastroDeDespesaRepository;

    @Override
    public String newObject(String   descrição, int valor, String data) {
        if(descrição!=null&&data!=null){
            Despesa despesa =new Despesa(descrição,valor,data, UUID.randomUUID());
            cadastroDeDespesaRepository.save(despesa);
            Storage.getInstance().setCadastros(despesa);
            return despesa.getData();
        }
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
