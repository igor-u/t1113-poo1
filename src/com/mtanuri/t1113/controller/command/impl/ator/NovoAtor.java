package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.model.ator.Ator;
import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class NovoAtor extends AtorCommand {
    public NovoAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Ator Ator = (Ator) params.get("ator");
        repository.inserir(Ator);
    }
}
