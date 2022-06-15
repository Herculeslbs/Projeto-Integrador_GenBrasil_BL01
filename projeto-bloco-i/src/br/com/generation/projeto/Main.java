package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Main {
	
	static int pontuacao;

	public static String escolha(int escolhido, String nome)
	{
		switch(escolhido)
		{
			case 1:
				Caminho01.situacao01(nome);
				pontuacao = Caminho01.escolhas.getQuantasEscolhas02();
				return "Não é normal haver diferentes possibilidads de tratamento "
						+ "apenas por ser mulher";
			case 2:
				Caminho02.situacao01(nome);
				pontuacao = Caminho02.escolhas.getQuantasEscolhas02();
				return "Não é normal haver diferentes possibilidads de tratamento "
						+ "apenas por ser mulher";
			default:
				return "Opção inválida";
		}
	}

	public static void main(String[] args) {

		String nomeMulher; 
		int escolha01;

		// Apresentação
		JOptionPane.showMessageDialog(null,
				"Neste Projeto iremos apresentar um Game interativo vivendo o dia "
				+ "a dia de uma mulher desenvolvedora!");
		
		JOptionPane.showMessageDialog(null,
				"O jogo é simples, tudo se baseia em possibilidades de situações que a "
				+ "protagonista precisa enfrentar no seu dia a dia de trabalho."
				+ "O jogo simula uma consequência, seja boa ou ruim, e você deve refletir "
				+ "qual a mais provável de acontecer com uma desenvolvedora...");

		JOptionPane.showMessageDialog(null, "Bom, já que entendeu, vamos começar!");
		
		do 
		{
		nomeMulher = JOptionPane.showInputDialog("Digite o nome da Protagonista para "
				+ "iniciar o jogo interativo:");
		}
		while(nomeMulher == null || nomeMulher.length() < 1);
		
		// Escolha do caminho
		JOptionPane.showMessageDialog(null, nomeMulher + " acordou para ir ao trabalho.");
		String mensagem;
		do
		{
			try 
			{
			escolha01 = Integer.parseInt(JOptionPane
					.showInputDialog("Agora vamos começar com as escolhas:\n1 - Acordou na hora "
							+ "| 2 - Acordou atrasada"));
				mensagem = escolha(escolha01, nomeMulher);	
			}
			catch(NumberFormatException e) 
			{
				mensagem = "Opção inválida";
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}
		while(mensagem == "Opção inválida");

		Final.publicoAlvo(pontuacao);
	}

	
}
