package com.projeto.projetotestg.dao;

public class CadastroDao<T> implements CRUD<T>{

	@Override
	public void salvar(T objeto) {
		System.out.println(objeto.toString());
		System.out.println("Incluído com sucesso");
	} 


	@Override
	public T obter(Long codigo) {
		return null;
	}

	@Override
	public boolean editar(T objeto) {
		return false;
	}

	@Override
	public boolean deletar(T objeto) {
		return false;
	}

}
