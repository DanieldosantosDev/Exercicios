package oo.encapsulamento;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Pedro",-45);
	p1.setIdade(230);
		//p1.idade = -30;
		System.out.println(p1.getIdade()); //ler
		System.out.println(p1); // to string
		
	}
}
