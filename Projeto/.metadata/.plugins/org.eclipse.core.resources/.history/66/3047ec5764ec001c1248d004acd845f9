package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Final {

	public static void publicoAlvo(int pontuacao) {
		
		int escolha;
		
		do 
		{
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Você já passou por isso ou conhece alguma mulher próxima que precisa enfrentar dilemas parecidos?\n\n"
				+ "1 - Já passei por isso :/\n"
				+ "2 - Conheço ou já uma mulher que passou por isso :/\n"
				+ "3 - Não me sinto confortável em responder essa pergunta"));
		}
		while (escolha != 1 && escolha != 2 && escolha != 3);
		
		switch (escolha)
		{
			case 1:
				Formulario01.formularioParaMulheres(pontuacao);
				break;
			case 2:
				Formulario02.formularioParaOutros(pontuacao);
				break;
			default:
				mensagemFinal(pontuacao);
				break;
		}
		
	}
	
	public static void mensagemFinal(int pontuacao) {
		double machista = pontuacao * (100/6.0);
			
		JOptionPane.showMessageDialog(null, "Obrigada pela atenção\n\n"
									+ "Você presencia " + machista + "% de situações misógenas\n"
									+ "© 2022\n"
									+ "Andreia Karoline\n"
									+ "Bruna Franchi\n"
									+ "Wanessa Koserski\n"
									+ "Matheus Victor\n"
									+ "Rian Ferreira\n"
									+ "Vinicius Silvestre\n"
									+ "Hercules Lima\n");
	}
	
}
