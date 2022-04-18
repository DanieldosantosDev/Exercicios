package oo.composicao;

public class Item {

	String Nome;
	int quantidade;
	double preco;
	Compra compra;

	Item(String nome, int quantidade, double preco) {
		this.Nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}