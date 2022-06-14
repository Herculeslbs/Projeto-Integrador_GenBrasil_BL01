package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Projeto {

	public static void main(String[] args) {

		String m1;

		int opcao1;

		JOptionPane.showMessageDialog(null,
				"Neste Projeto iremos apresentar um Game interativo vivendo o dia a dia de uma mulher desenvolvedora!");

		JOptionPane.showMessageDialog(null,
				"O jogo é simples, tudo se baseia em escolhas, e cada escolha feita no jogo gera uma consequência, seja boa ou ruim!");

		JOptionPane.showMessageDialog(null, "Bom, já que entendeu, vamos começar!");

		m1 = JOptionPane.showInputDialog("Digite o nome da Protagonista para iniciar o jogo interativo:");

		JOptionPane.showMessageDialog(null, m1 + " Acordou para ir ao trabalho.");

		opcao1 = Integer.parseInt(JOptionPane
				.showInputDialog("Agora vamos começar com as escolhas:\n1 - Acordou na hora | 2 - Acordou atrasada"));

		if (opcao1 == 1) {

			JOptionPane.showMessageDialog(null, m1
					+ " Se arruma, sai de casa e dirige até o trabalho. No estacionamento acidentalmente encosta no carro de um funcionário que estava chegando.");

			metodo01.metodo01(m1);
		}

		else if (opcao1 == 2) {
			JOptionPane.showMessageDialog(null, m1
					+ " Ficou preocupada em se atrasar para o trabalho, então, colocou rapidamente um shorts e uma blusa que encontrou no armário, e levar a roupa para se trocar no local para evitar o atraso.");

			metodo02.metodo02(m1);
		}

		else {
			System.out.println("Opção inválida");
		}

	}

}
