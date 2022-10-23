package excecao;

import excecao.personalizadaA.NumeroForaIntervaloException;
import excecao.personalizadaA.StringVaziaException;
import excecao.personalizadaA.Validar;

public class TesteValidacoes {
	public static void main(String[] args) throws StringVaziaException, NumeroForaIntervaloException {
		
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaIntervaloException
				| IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
		System.out.println(e.getMessage());
	
		}
		System.out.println("Fim");
		
	}

}
