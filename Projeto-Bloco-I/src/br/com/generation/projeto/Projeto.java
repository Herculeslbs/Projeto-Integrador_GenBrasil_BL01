package br.com.generation.projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Projeto {

	public static void main(String[] args) {

		String m1 = null;

		int opcao1, opcao2;

		m1 = JOptionPane.showInputDialog("Digite o nome da Protagonista para iniciar o jogo interativo");

		JOptionPane.showMessageDialog(null, m1 + " acordou para ir ao trabalho.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Agora vamos começar com as escolhas:\n1 - Acordou na hora | 2 - Acordou atrasada"));

		if (opcao1 == 1) {
			
			JOptionPane.showMessageDialog(null, m1 + " se arruma, sai de casa e dirige até o trabalho. No estacionamento acidentalmente encosta no carro de um funcionário que estava chegando");
		}

		else if (opcao1 == 2) {
			JOptionPane.showMessageDialog(null, m1 + " ficou preocupada em se atrasar para o trabalho, então, colocou rapidamente um"+ " shorts e uma blusa que encontrou e resolveu se trocar no trabalho.");
		}

		else {
			System.out.println("Opção inválida");
		}

		JOptionPane.showMessageDialog(null, "Escolha a opção a seguir");
		
		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, " + m1 + " deu" + " seu número e se prontificou a chamar o seguro.\n\n" + "O outro funcionário a tranquilizou dizendo: acidentes acontecem!\n\n" + "2 - O funcionário sai do carro bravo," + m1 + " Dizendo as seguintes palavra: tinha que ser mulher para não saber dirigir!\n\n" + m1 + " sentiu medo por trabalhar no mesmo local que este homem, também se sentiu frustrada " + "por ter cometido esse deslize."));
		
		
	}

}
