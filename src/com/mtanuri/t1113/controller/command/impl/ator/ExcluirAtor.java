package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class ExcluirAtor extends AtorCommand {
    public ExcluirAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        repository.excluir(idAtor);
    }
}
