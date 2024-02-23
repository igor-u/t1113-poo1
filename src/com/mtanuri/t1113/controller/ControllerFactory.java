package com.mtanuri.t1113.controller;

import com.mtanuri.t1113.repository.impl.AtorRepositoryInMemoryImpl;
import com.mtanuri.t1113.repository.impl.DiretorRepositoryInMemoryImpl;
import com.mtanuri.t1113.repository.impl.FilmeRepositoryInMemoryImpl;

public class ControllerFactory {

	@SuppressWarnings("rawtypes")
	public Controller getTipo(TipoController tipo) {
		if(tipo == TipoController.FILME) {
			return new FilmeController(new FilmeRepositoryInMemoryImpl());

		} else if(tipo == TipoController.ATOR) {
			return new AtorController(new AtorRepositoryInMemoryImpl());

		} else if(tipo == TipoController.DIRETOR) {
			return new DiretorController(new DiretorRepositoryInMemoryImpl());
		}
		return null;
	}

}
