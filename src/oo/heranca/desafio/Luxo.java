package oo.heranca.desafio;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	int nivelDoAr();
	
	default int velocidadeDoAr() {
		return 1;
	}

}
