package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Caminho02 {
	
	static Contabilizar escolhas = new Contabilizar();
	static int escolha;

	public static void contabilizar(int escolhido)
	{
		if (escolhido == 1)
		{
			escolhas.somarEscolhas01();
		}
		else
		{
			escolhas.somarEscolhas02();
		}
	}

	
	public static void situacao01(String nome) {

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");
		do
		{
			escolha = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Foi ao trabalho sem intercorrências\n\n"
											+ "2 - No ônibus, percebeu alguns olhares por conta de sua "
											+ "roupa e se sentiu desconfortável"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao02(nome);
	}
	
	
	public static void situacao02(String nome) {
		
		do
		{
			escolha = Integer.parseInt(
				JOptionPane.showInputDialog(nome + " chegou na empresa e foi ao banheiro se trocar, avisando a todos "
											+ "que por conta de seus compromissos tinha acordado atrasada\n\n"
											+ "1 - Seus colegas de trabalho compreenderam o motivo, estão todos "
											+ "sobrecarregados, então imprevistos podem ocorrer\n"
											+ "2 - Seus colegas de trabalho não acreditaram em suas palavras e acham "
											+ "que aquilo foi uma falta de comprometimento com as regras da empresa"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao03(nome);
	}
	
	
		public static void situacao03(String nome) {
		
		do
		{
			escolha = Integer.parseInt(
					JOptionPane.showInputDialog(nome + " chegou na empresa e foi ao banheiro se trocar, avisando a todos "
												+ "que por conta de seus compromissos tinha acordado atrasada\n\n"
												+ "1 - Seus colegas de trabalho aprovam as suas sugestões e a parabenizam "
												+ "pela ideia\n"
												+ "2 - Um colega de trabalho repete a sugestão de {nome} e lhe é atribuido "
												+ "o crédito"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
				
	}

	
}
