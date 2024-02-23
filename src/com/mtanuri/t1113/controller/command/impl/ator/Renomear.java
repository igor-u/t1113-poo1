package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class Renomear extends AtorCommand {
    public Renomear(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        String nome = (String) params.get("nome");
        repository.renomear(idAtor, nome);
    }
}
