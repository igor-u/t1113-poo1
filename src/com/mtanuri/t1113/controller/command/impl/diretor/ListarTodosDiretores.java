package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class ListarTodosDiretores extends DiretorCommand {


    public ListarTodosDiretores(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
