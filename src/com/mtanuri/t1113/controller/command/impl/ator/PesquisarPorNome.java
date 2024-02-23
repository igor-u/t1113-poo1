package com.mtanuri.t1113.controller.command.impl.ator;

import com.mtanuri.t1113.repository.AtorRepository;

import java.util.Map;

public class PesquisarPorNome extends AtorCommand {
	public PesquisarPorNome(AtorRepository repository) {
		super(repository);
	}

	@Override
	public void executar(Map<String, Object> params) {
		String keywords = (String) params.get("keywords");
		repository.pesquisarPorNome(keywords).forEach(System.out::println);

	}
}
