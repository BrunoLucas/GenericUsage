package com.projeto.projetotestg.main.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.projeto.projetotestg.dao.CRUD;
import com.projeto.projetotestg.dao.CadastroDao;
import com.projeto.projetotestg.dto.Colecionador;
import com.projeto.projetotestg.dto.Item;
import com.projeto.projetotestg.dto.Localizacao;
import com.projeto.projetotestg.dto.Pessoa;
import com.projeto.projetotestg.dto.Pokemon;
import com.projeto.projetotestg.dto.Tipo;
import com.projeto.projetotestg.dto.Treinador;

public class MainTest {

	public static void main(String[] args) {

		Colecionador colecionador =  popularColecionador();
		Treinador treinador = popularTreinador();
		
		CRUD<Pessoa> cadastroDao = new CadastroDao<Pessoa>();
		cadastroDao.salvar(colecionador);
		cadastroDao.salvar(treinador);
		
	}
	
	
	private static Colecionador popularColecionador(){
		Colecionador colecionador = new Colecionador();
		colecionador.setCodigo(1L);
		colecionador.setNome("Cobain Lua");
		colecionador.setEmail("lua@gmail.com");
		colecionador.setDataInicio(LocalDate.now());
		colecionador.setLocalizacaoAtual(new Localizacao(123L, 123L));
		colecionador.setNivel(1L);
		colecionador.setTipoPreferido(Tipo.AGUA);
		colecionador.setObjetoCaca("Celular");
		
		Pokemon pikachu = new Pokemon();
		pikachu.setCodigo(1L);
		pikachu.setNome("Pikachu");
		pikachu.setTipo(Tipo.ELETRICO);
	
		List<Pokemon> listaPokemon = new ArrayList<Pokemon>();
		listaPokemon.add(pikachu);
		colecionador.setPokemonCapturados(listaPokemon);
		colecionador.setPokemonPreferido(pikachu);
		colecionador.setPontosExperiencia(1L);
		
		return colecionador;
	}
	
	private static Treinador popularTreinador(){
		Treinador treinador = new Treinador();
		treinador.setCodigo(1L);
		treinador.setNome("Dargon Kraus");
		treinador.setEmail("D.kraus@gmail.com");
		treinador.setDataInicio(LocalDate.now());
		treinador.setLocalizacaoAtual(new Localizacao(123L, 123L));
		treinador.setNivel(1L);
		
		List<Item> listaItens = new ArrayList<Item>();
		Item pokebola = new Item();
		pokebola.setCodigo(1);
		pokebola.setNome("Pokébola");
		listaItens.add(pokebola);
		
		treinador.setItensObtidos(listaItens);
		
		Pokemon charmander = new Pokemon();
		charmander.setCodigo(1L);
		charmander.setNome("Charmander");
		charmander.setTipo(Tipo.FOGO);
	
		List<Pokemon> listaPokemon = new ArrayList<Pokemon>();
		listaPokemon.add(charmander);
		treinador.setPokemonCapturados(listaPokemon);
		treinador.setPokemonPreferido(charmander);
		treinador.setPontosExperiencia(1L);
		
		return treinador;
	}

}
