package br.com.ul.cm.visao;

import br.com.ul.cm.modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 6);
		new TabuleiroConsole(tabuleiro);
				
	}

}
