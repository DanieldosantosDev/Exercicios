package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		c1.ligar();
		System.out.println(c1.motor.giros());

		c1.acelear();
		c1.acelear();
		c1.acelear();
		c1.acelear();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		// faltou encapsulamento!!!
		// c1.motor.fatorInjecao = -30;

		System.out.println(c1.motor.giros());

	}
}
