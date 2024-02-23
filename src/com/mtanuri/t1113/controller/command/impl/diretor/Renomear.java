package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class Renomear extends DiretorCommand {
    public Renomear(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        String nome = (String) params.get("nome");
        repository.renomear(idDiretor, nome);
    }
}
