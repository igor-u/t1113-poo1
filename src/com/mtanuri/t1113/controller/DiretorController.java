package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.repository.DiretorRepository;
import com.mtanuri.t1113.model.diretor.Diretor;

public class DiretorController extends Controller<Diretor> {

	//private DiretorRepository diretoresRepository;

	public DiretorController(DiretorRepository repository) {
		super.crudRepository = repository;
	}

	//	public void executar(OperacaoAtorDiretor operacao, Diretor diretor) {
	//		if (operacao == OperacaoAtorDiretor.INSERIR) {
	//			diretoresRepository.inserir(diretor);
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, int idDiretor, Filme filme){
	//		if(operacao == OperacaoAtorDiretor.ADICIONAR_FILME){
	//			diretoresRepository.adicionarFilme(idDiretor, filme);
	//		}
	//	}
	//
	//	public void executar(OperacaoAtorDiretor operacao, int idDiretor, int idFilme){
	//		if(operacao == OperacaoAtorDiretor.REMOVER_FILME){
	//			diretoresRepository.removerFilme(idDiretor, idFilme);
	//		}
	//
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, int id, String nome) {
	//		if(operacao == OperacaoAtorDiretor.RENOMEAR) {
	//			diretoresRepository.renomear(id, nome);
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, int id) {
	//		if(operacao == OperacaoAtorDiretor.EXCLUIR) {
	//			try {
	//				diretoresRepository.excluir(id);
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao) {
	//		if(operacao == OperacaoAtorDiretor.LISTAR_TODOS) {
	//			diretoresRepository.listarTodos().forEach((System.out::println));
	//		}
	//	}

	//	public void executar(OperacaoAtorDiretor operacao, String nomeOuParteDoNome) {
	//		if(operacao == OperacaoAtorDiretor.PESQUISAR) {
	//			diretoresRepository.pesquisarPorNome(nomeOuParteDoNome).forEach(System.out::println);
	//		}
	//	}

}
