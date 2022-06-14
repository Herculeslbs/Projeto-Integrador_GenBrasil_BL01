package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Projeto {
	
	public static String escolha(int escolhido, String nome)
	{
		switch(escolhido)
		{
			case 1:
				Caminho01.situacao01(nome);
				return nome + " se arruma, sai de casa e dirige até o trabalho. "
						+ "No estacionamento acidentalmente encosta no carro de "
						+ "um funcionário que estava chegando.";
			case 2:
				Caminho02.situacao01(nome);
				return nome + " Ficou preocupada em se atrasar para o trabalho, "
						+ "então, colocou rapidamente um shorts e uma blusa que "
						+ "encontrou no armário, e levar a roupa para se trocar "
						+ "no local para evitar o atraso.";
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
				"O jogo é simples, tudo se baseia em escolhas, e cada escolha feita "
				+ "no jogo gera uma consequ�ncia, seja boa ou ruim!");

		JOptionPane.showMessageDialog(null, "Bom, já que entendeu, vamos come�ar!");

		nomeMulher = JOptionPane.showInputDialog("Digite o nome da Protagonista para "
				+ "iniciar o jogo interativo:");

		// Escolha do caminho
		JOptionPane.showMessageDialog(null, nomeMulher + " acordou para ir ao trabalho.");
		String mensagem;
		do
		{
			escolha01 = Integer.parseInt(JOptionPane
					.showInputDialog("Agora vamos começar com as escolhas:\n1 - Acordou na hora | 2 - Acordou atrasada"));
			mensagem = escolha(escolha01, nomeMulher);
			JOptionPane.showMessageDialog(null, mensagem);
		}
		while(mensagem == "Opção inválida");

	}

}
