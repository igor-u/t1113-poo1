package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class PesquisarPorNome extends DiretorCommand {
    public PesquisarPorNome(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        String keywords = (String) params.get("keywords");
        repository.pesquisarPorNome(keywords).forEach(System.out::println);

    }
}
