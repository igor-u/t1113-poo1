package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;
import java.util.Optional;

import com.mtanuri.t1113.controller.command.Command;
import com.mtanuri.t1113.controller.command.factory.DiretoresCommandFactory;
import com.mtanuri.t1113.controller.command.operacao.OperacoesDiretor;

public class DiretorController {

	private DiretorRepository diretoresRepository;

	private DiretorController(DiretorRepository repository) {
		this.diretoresRepository = repository;
	}

	private static DiretorController instance ;

	public static DiretorController getInstance(DiretorRepository repository){
		if(instance==null){
			instance = new DiretorController(repository);
		}
		return instance;
	}

	public void executar(OperacoesDiretor operacao) {
		this.executar(operacao, null);
	}
	
	public void executar(OperacoesDiretor operacao, Map<String, Object> params) {
		Optional<Command> command = DiretoresCommandFactory.getInstance(diretoresRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}
