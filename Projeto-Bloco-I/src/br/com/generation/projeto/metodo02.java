package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo02 {

	public static void metodo03(String nome) {
		
		int opcao2;
		
		JOptionPane.showMessageDialog(null, "Escolha as opção a seguir");

		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Foi ao trabalho sem intercorrências.\n2 - No ônibus percebeu alguns olhares por conta de sua roupa e se sentiu desconfortável."));

		JOptionPane.showMessageDialog(null, nome + " chegou na empresa e foi ao banheiro se trocar, avisando a todos que por conta de seus compromissos tinha acordado atrasada");
		
		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Seus colegas de trabalho compreenderam o motivo, estão todos sobrecarregados, então imprevistos podem ocorrer.\n2 - Seus colegas de trabalho não acreditaram em suas palavras e acham que aquilo foi uma falta de comprometimento com as regras da empresa."));

		JOptionPane.showMessageDialog(null, "Na reunião " + nome + " traz uma proposta para o projeto.");

	}
}
