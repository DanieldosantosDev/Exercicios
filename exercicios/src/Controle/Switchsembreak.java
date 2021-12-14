package Controle;

public class Switchsembreak {
	
	public static void main(String[] args) {
		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta":
		System.out.println("Sei o Bassai-Dai...");
		case "maroom":
		System.out.println("Sei o Tekki Shodan");
		case "roxa":
		System.out.println("Sei o Heian Godan");
		case "verde	":
		System.out.println("Sei o Heian Youdan");
		case "vermelha":
		System.out.println("Sei o Heian Sandan");
		case "amarela":
		System.out.println("Sei o Heian Nindan");
		break;
		default:
		
		System.out.println("Não sei porra nenhuma");
		}
		System.out.println("Fim");
	}

}
