package com.mtanuri.t1113.repository;

import java.util.List;

import com.mtanuri.t1113.model.ator.Ator;
import com.mtanuri.t1113.model.diretor.Diretor;
import com.mtanuri.t1113.model.filme.Filme;
import com.mtanuri.t1113.repository.impl.TipoVinculo;

public interface CrudRepository<T> {
	
	public T inserir(T entry);
	
	public T renomear(int id, String nome);
	
	public void excluir(int id);
	
	public List<T> listarTodos();
	
	public List<T> pesquisarPorNome(String nomeOuParteDoNome);
	
	public void vincular(Filme filme, int id);

	public void desvincular(Filme filme, int id);
	
	public void vincular(TipoVinculo t, Ator ator, int id);

	public void desvincular(TipoVinculo t, Ator ator, int id);
	
	public void vincular(TipoVinculo t, Diretor diretor, int id);

	public void desvincular(TipoVinculo t, Diretor diretor, int id);

}
