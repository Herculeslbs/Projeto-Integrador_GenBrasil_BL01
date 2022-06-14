package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo01 {

	public static void metodo01(String nome) {
		
		int opcao1;
		
		JOptionPane.showMessageDialog(null, "Escolha as opção a seguir");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Acordou na hora | 2 - Acordou atrasada"));
	
	}

}
