package Controle;

import javax.swing.JOptionPane;

public class ifElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número");
		int numero = Integer.parseInt(valor);
		
		if 	(numero % 2 == 0) {
			System.out.println("numero par");
		
		} else 
			System.out.println("numero impar");
		
	}
}
	
