package classe;

public class ProdutoTeste {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		p1.desconto = 0.25;

		var p2 = new Produto("Caneta Preta");
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome + "" + p1.precoComDesconto());
		System.out.println(p2.nome + "" + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("M�dia carrinho = R$%.2f", mediaCarrinho);

	}
}
