package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.repository.AtorRepository;
import com.mtanuri.t1113.model.ator.Ator;

public class AtorController extends Controller<Ator> {

	//private AtorRepository atoresRepository;

	public AtorController(AtorRepository repository) {
		super.crudRepository = repository;
	}


	//	public void executar(OperacaoAtorDiretor operacao, Ator ator) {
	//		if(operacao == OperacaoAtorDiretor.INSERIR) {
	//			atoresRepository.inserir(ator);
	//		}
	//
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, Filme filme, int idAtor){
	//		if(operacao == OperacaoAtorDiretor.ADICIONAR_FILME){
	//			atoresRepository.vincular(filme, idAtor);
	//		}
	//	}
	//
	//	public void executar(OperacaoAtorDiretor operacao, Filme filme, int idAtor){
	//		if(operacao == OperacaoAtorDiretor.REMOVER_FILME){
	//			atoresRepository.desvincular(filme, idAtor);
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, int id, String nome) {
	//		if(operacao == OperacaoAtorDiretor.RENOMEAR) {
	//			atoresRepository.renomear(id, nome);
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, int id) {
	//		if(operacao == OperacaoAtorDiretor.EXCLUIR) {
	//			try {
	//				atoresRepository.excluir(id);
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao) {
	//		if(operacao == OperacaoAtorDiretor.LISTAR_TODOS) {
	//			atoresRepository.listarTodos().forEach((System.out::println));
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, String nomeOuParteDoNome) {
	//		if(operacao == OperacaoAtorDiretor.PESQUISAR) {
	//			atoresRepository.pesquisarPorNome(nomeOuParteDoNome).forEach(System.out::println);
	//		}
	//	}

}
