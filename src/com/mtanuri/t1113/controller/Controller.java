package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.model.ator.Ator;
import com.mtanuri.t1113.model.diretor.Diretor;
import com.mtanuri.t1113.model.filme.Filme;
import com.mtanuri.t1113.repository.CrudRepository;
import com.mtanuri.t1113.repository.impl.TipoVinculo;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class Controller<T> {

	public CrudRepository crudRepository;
	
	public void executar(String command, T entry) {
		if (command == "INSERIR") {
			crudRepository.inserir(entry);
		}
	}
	
	public void executar(String command) {
		if (command == "LISTAR_TODOS") {
			crudRepository.listarTodos().forEach((System.out::println));
		}
	}
	
	public void executar(String command, String nomeOuParteDoNome) {
		if(command == "PESQUISAR") {
			crudRepository.pesquisarPorNome(nomeOuParteDoNome).forEach(System.out::println);
		}
	}
	
	public void executar(String command, int id, String nome) {
		if(command == "RENOMEAR") {
			crudRepository.renomear(id, nome);
		}
	}
	
	public void executar(String command, int id) {
		if(command == "EXCLUIR") {
			try {
				crudRepository.excluir(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void executar(String command, TipoVinculo tipoVinculo, Ator ator, int id) {
		if(command == "DESVINCULAR" && tipoVinculo == TipoVinculo.ATOR_FILME) {
			crudRepository.desvincular(tipoVinculo, ator, id);
		} else if(command == "VINCULAR" && tipoVinculo == TipoVinculo.ATOR_FILME) {
			crudRepository.vincular(tipoVinculo, ator, id);
		}
	}
	
	public void executar(String command, TipoVinculo tipoVinculo, Diretor diretor, int id) {
		if(command == "DESVINCULAR" && tipoVinculo == TipoVinculo.DIRETOR_FILME) {
			crudRepository.desvincular(tipoVinculo, diretor, id);
		} else if(command == "VINCULAR" && tipoVinculo == TipoVinculo.DIRETOR_FILME) {
			crudRepository.vincular(tipoVinculo, diretor, id);
		}
	}
	
	public void executar(String command, Filme filme, int id) {
		if(command == "DESVINCULAR") {
			crudRepository.desvincular(filme, id);
		} else if(command == "VINCULAR") {
			crudRepository.vincular(filme, id);
		}
	}
	
}
