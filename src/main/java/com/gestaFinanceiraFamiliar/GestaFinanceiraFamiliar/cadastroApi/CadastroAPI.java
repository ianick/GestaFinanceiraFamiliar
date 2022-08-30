package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.cadastroApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CadastroAPI <T>{

    public <T> T newObject(@RequestBody String descrição, @RequestParam int valor, @RequestParam String data);
    public <T> List<T> getall();
    public <T> T updateToObject(@PathVariable("name") String name);
    public <T> T removeObjectId(@PathVariable("id") String id);

}
