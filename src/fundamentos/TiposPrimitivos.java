package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informa��es do funcionario
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano
		boolean estaDeFerias = false; // true

		// tipo caractere
		char status = 'A'; // ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}
}
