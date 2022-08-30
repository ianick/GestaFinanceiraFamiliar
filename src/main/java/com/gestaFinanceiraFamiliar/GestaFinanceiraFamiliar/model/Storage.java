package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar.model;


import java.util.HashMap;
import java.util.Map;

public class Storage <T>{
    private Map<String, T> cadastros;

    private static Storage instance;

    private Storage(){
        cadastros = new HashMap<>();
    }

    public static synchronized  Storage getInstance(){
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public Map<String, T> getCadastros() {
        return cadastros;
    }

    public void setCadastros(T cadastro) {
        cadastros.put(cadastro.getClass().getName(), cadastro);
    }
}
