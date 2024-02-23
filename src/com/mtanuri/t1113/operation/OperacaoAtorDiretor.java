package com.mtanuri.t1113.operation;

public enum OperacaoAtorDiretor implements OperacaoInterface {

	INSERIR, LISTAR_TODOS, PESQUISAR, EXCLUIR, RENOMEAR, VINCULAR;

	@Override
	public String getId() {
		return name();
	}

}
