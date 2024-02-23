package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.model.diretor.Diretor;
import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class NovoDiretor extends DiretorCommand {
    public NovoDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Diretor diretor = (Diretor) params.get("diretor");
        repository.inserir(diretor);
    }
}
