package Controle;

import java.util.Scanner;

public class Switchcombreak {
	
	public static void main(String[] args) {
		Scanner  entrada = new Scanner(System.in);
	
		String conceito = "";
		System.out.println("informe a nota");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "A";
			break;
		}
			System.out.println("Conceito �" + conceito);
			entrada.close();
		}
	}

