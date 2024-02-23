package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.repository.FilmeRepository;
import com.mtanuri.t1113.model.filme.Filme;


public class FilmeController extends Controller<Filme> {

	//private FilmeRepository filmesRepository;

	public FilmeController(FilmeRepository repository) {
		super.crudRepository =  repository; 
	}

	//	public void executar(String command, Filme filme) {
	//		if (command == OperacaoFilme.INSERIR.getId()) {
	//			filmesRepository.inserir(filme);
	//		}
	//	}

	//	public void executar(OperacaoFilme operacao, int idFilme, Ator ator) {
	//		if (operacao == OperacaoFilme.ADICIONAR_ATOR) {
	//			filmesRepository.adicionarAtor(idFilme, ator);
	//			return;
	//		}
	//	}
	//
	//	public void executar(OperacaoFilme operacao, int idFilme, Diretor diretor) {
	//		if (operacao == OperacaoFilme.ADICIONAR_DIRETOR) {
	//			filmesRepository.adicionarDiretor(idFilme, diretor);
	//			return;
	//		}
	//	}
	//
	//	public void executar(OperacaoFilme operacao, int idFilme, int idAtorOuDiretor) {
	//		if (operacao == OperacaoFilme.REMOVER_ATOR) {
	//			filmesRepository.removerAtor(idFilme, idAtorOuDiretor);
	//			return;
	//		}
	//
	//		if (operacao == OperacaoFilme.REMOVER_DIRETOR) {
	//			filmesRepository.removerDiretor(idFilme, idAtorOuDiretor);
	//		}
	//
	//	}

	//	public void executar(Operacao operacao, int id, String nomeOuDescricao) {
	//		if (operacao == Operacao.RENOMEAR) {
	//			filmesRepository.renomear(id, nomeOuDescricao);
	//		}
	//	}


	/*
	 * public void executar(OperacaoFilme operacao, int id, String nomeOuDescricao)
	 * { if (operacao == OperacaoFilme.ATUALIZAR_DESCRICAO) {
	 * filmesRepository.atualizarDescricao(id, nomeOuDescricao); } }
	 */

	//	public void executar(OperacaoFilme operacao, int id) {
	//		if (operacao == OperacaoFilme.EXCLUIR) {
	//			try {
	//				filmesRepository.excluir(id);
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	}

	//	public void executar(OperacaoFilme operacao) {
	//		if (operacao == OperacaoFilme.LISTAR_TODOS) {
	//			filmesRepository.listarTodos().forEach((System.out::println));
	//		}
	//	}

	//	public void executar(OperacaoFilme operacao, String nomeOuParteDoNome) {
	//		if (operacao == OperacaoFilme.PESQUISAR) {
	//			filmesRepository.pesquisarPorNome(nomeOuParteDoNome).forEach(System.out::println);
	//		}
	//	}

}
