package br.com.devmedia.aprendendojava.aplicacao;

import java.util.Scanner;

import br.com.devmedia.aprendendojava.dominio.Colecionador;
import br.com.devmedia.aprendendojava.dominio.Item;

public class Programa {

	public static void main(String args[]) {
		Colecionador colecionador;
		Item item;
		String nomeDoColecionador, nomeDoItem;
		int ano;
		Scanner lerDados = new Scanner(System.in);


		System.out.print("Informe o nome do Colecionador:  ");

		nomeDoColecionador = lerDados.nextLine();

		colecionador = new Colecionador(nomeDoColecionador);
		while(true) {
			System.out.println("==============================");
			System.out.print("Informe o nome do Item: ");
			nomeDoItem = lerDados.nextLine();

			System.out.print("Informe o ano em que esse item foi fabricado: ");
			ano = Integer.parseInt(lerDados.nextLine());

			item = new Item(nomeDoItem, ano);
			colecionador.getColecao().add(item);		
		}
	}
}
