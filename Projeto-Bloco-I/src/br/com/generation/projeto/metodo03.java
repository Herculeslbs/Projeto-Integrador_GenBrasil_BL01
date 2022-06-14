package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo03 {

	public static void metodo03(String nome) {
		
		int opcao1;
		
		JOptionPane.showMessageDialog(null, "Escolha as opção a seguir");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - "));

		JOptionPane.showMessageDialog(null, "");
		
		opcao1 = Integer.parseInt(JOptionPane.showInputDialog(""));

		JOptionPane.showMessageDialog(null, "");

	}
}
