package com.mtanuri.t1113.operation;

public enum Operacao implements OperacaoInterface {

	INSERIR, LISTAR_TODOS, PESQUISAR, EXCLUIR, RENOMEAR, VINCULAR, DESVINCULAR;

	@Override
	public String getId() {
		return name();
	}

}
