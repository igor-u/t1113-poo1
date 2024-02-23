package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class ListarTodosAtores extends AtorCommand {


    public ListarTodosAtores(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
