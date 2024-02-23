package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class RemoveFilme extends AtorCommand {
    public RemoveFilme(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        int idFilme = (int) params.get("idFilme");
        repository.removerFilme(idAtor, idFilme);
    }
}
