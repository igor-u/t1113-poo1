package com.mtanuri.t1113.operation;

public enum OperacaoFilme implements OperacaoInterface {

	ATUALIZAR_DESCRICAO;

	@Override
	public String getId() {
		return name();
	}

}
