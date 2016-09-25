package com.projeto.projetotestg.dao;

public interface CRUD<T> {

	public void salvar(T objeto);
	
	public T obter(Long codigo);
	
	public boolean editar(T objeto);
	
	public boolean deletar(T objeto);
}
