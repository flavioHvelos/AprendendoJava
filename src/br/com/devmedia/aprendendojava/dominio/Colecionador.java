package br.com.devmedia.aprendendojava.dominio;

import java.util.ArrayList;
import java.util.List;

public class Colecionador {
	
	private String nome;
	private List<Item> colecao;
	
	public Colecionador(String nome) {
		this.nome = nome;
		colecao = new ArrayList<Item>();
	}

}
