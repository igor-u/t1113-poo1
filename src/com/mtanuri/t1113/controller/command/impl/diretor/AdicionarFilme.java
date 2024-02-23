package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.model.filme.Filme;
import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class AdicionarFilme extends DiretorCommand {
    public AdicionarFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idDiretor = (Integer) params.get("idDiretor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idDiretor, filme);
    }
}
