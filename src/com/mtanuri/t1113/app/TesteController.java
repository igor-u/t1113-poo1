package com.mtanuri.t1113.app;

import com.mtanuri.t1113.controller.Controller;
import com.mtanuri.t1113.controller.ControllerFactory;
import com.mtanuri.t1113.controller.TipoController;
import com.mtanuri.t1113.model.ator.Ator;
import com.mtanuri.t1113.model.ator.AtorBuilder;
import com.mtanuri.t1113.model.diretor.Diretor;
import com.mtanuri.t1113.model.diretor.DiretorBuilder;
import com.mtanuri.t1113.model.filme.Filme;
import com.mtanuri.t1113.model.filme.FilmeBuilder;
import com.mtanuri.t1113.operation.Operacao;
import com.mtanuri.t1113.repository.impl.TipoVinculo;

public class TesteController {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Controller filmeController = new ControllerFactory().getTipo(TipoController.FILME);
		Controller atorController = new ControllerFactory().getTipo(TipoController.ATOR);
		Controller diretorController = new ControllerFactory().getTipo(TipoController.DIRETOR);

		Filme filme = new FilmeBuilder().comNome("Batman").comDescricao("Descricao").build();
		Ator ator = new AtorBuilder().comNome("Joao").build();
		Ator ator2 = new AtorBuilder().comNome("Jose").build();
		Diretor diretor = new DiretorBuilder().comNome("Maria").build();

		filmeController.executar(Operacao.INSERIR.getId(), filme);
		atorController.executar(Operacao.INSERIR.getId(), ator);
		atorController.executar(Operacao.INSERIR.getId(), ator2);
		diretorController.executar(Operacao.INSERIR.getId(), diretor);

		System.out.println("///////////\nLista inicial\n///////////\n");

		atorController.executar(Operacao.LISTAR_TODOS.getId());
		diretorController.executar(Operacao.LISTAR_TODOS.getId());
		filmeController.executar(Operacao.LISTAR_TODOS.getId());


		atorController.executar(Operacao.VINCULAR.getId(), filme, 1);
		diretorController.executar(Operacao.VINCULAR.getId(), filme, 1);

		System.out.println("///////////\nApós vincular atores e diretores ao filme\n///////////\n");

		filmeController.executar(Operacao.LISTAR_TODOS.getId());


		filmeController.executar(Operacao.DESVINCULAR.getId(), TipoVinculo.ATOR_FILME, ator, 1);

		System.out.println("///////////\nApós desvincular ator do filme\n///////////\n");

		filmeController.executar(Operacao.LISTAR_TODOS.getId());
		
		diretorController.executar(Operacao.EXCLUIR.getId(), 1);
		
		System.out.println("///////////\nApós excluir diretor do sistema\n///////////\n");
		
		filmeController.executar(Operacao.LISTAR_TODOS.getId());

	}

}
