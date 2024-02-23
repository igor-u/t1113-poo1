package com.mtanuri.t1113.repository;

import com.mtanuri.t1113.model.filme.Filme;

public interface FilmeRepository extends CrudRepository<Filme> {

	public Filme atualizarDescricao(int id, String descricao);

}