package com.mtanuri.t1113.controller.command.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.mtanuri.t1113.controller.command.Command;
import com.mtanuri.t1113.controller.command.impl.diretor.AdicionarFilme;
import com.mtanuri.t1113.controller.command.impl.diretor.ExcluirDiretor;
import com.mtanuri.t1113.controller.command.impl.diretor.ListarTodosDiretores;
import com.mtanuri.t1113.controller.command.impl.diretor.NovoDiretor;
import com.mtanuri.t1113.controller.command.impl.diretor.RemoveFilme;
import com.mtanuri.t1113.controller.command.impl.diretor.PesquisarPorNome;
import com.mtanuri.t1113.controller.command.impl.diretor.Renomear;
import com.mtanuri.t1113.controller.command.operacao.OperacoesDiretor;
import com.mtanuri.t1113.repository.DiretorRepository;

public class DiretoresCommandFactory {

    private final DiretorRepository repository;

    private static DiretoresCommandFactory instance;

    private final Map<OperacoesDiretor, Command> commandMap;



    private DiretoresCommandFactory(DiretorRepository repository) {
        this.repository = repository;
        this.commandMap = initializeCommands();
    }

    public static DiretoresCommandFactory getInstance(DiretorRepository repository){
        if(instance==null){
            instance = new DiretoresCommandFactory(repository);
        }
        return instance;
    }

    private Map<OperacoesDiretor, Command> initializeCommands() {
        Map<OperacoesDiretor, Command> map = new HashMap<>();
        map.put(OperacoesDiretor.INSERIR, new NovoDiretor(repository));
        map.put(OperacoesDiretor.EXCLUIR, new ExcluirDiretor(repository));
        map.put(OperacoesDiretor.RENOMEAR, new Renomear(repository));
        map.put(OperacoesDiretor.LISTAR_TODOS, new ListarTodosDiretores(repository));
        map.put(OperacoesDiretor.PESQUISAR_POR_NOME, new PesquisarPorNome(repository));
        map.put(OperacoesDiretor.ADICIONAR_FILME, new AdicionarFilme(repository));
        map.put(OperacoesDiretor.REMOVER_FILME, new RemoveFilme(repository));
        return map;
    }

    public Optional<Command> getCommand(OperacoesDiretor operacoesDiretor) {
        Command command = commandMap.get(operacoesDiretor);
        return Optional.ofNullable(command);
    }
}
