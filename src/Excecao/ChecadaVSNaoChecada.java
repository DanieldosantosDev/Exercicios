package Excecao;

public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
	
	try {
		gerarErro1();
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}

	try {
		gerarErro2();
	} catch (Throwable e) {
		e.getMessage();
	}
	
		System.out.println("Fim");
	
}
	static void gerarErro1() throws RuntimeException  {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	static void gerarErro2() {
		try {
			throw new Exception("Ocorreu um erro bem legal #2");
			}
		catch (Exception e) {
			System.out.println("que legal");
		}
	}
}