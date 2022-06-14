package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo01 {

	public static void metodo01(String nome) {

		int opcao1;

		JOptionPane.showMessageDialog(null, "Escolha as opções a seguir");

		opcao1 = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, "
						+ nome + " deu" + " seu número e se prontificou a chamar o seguro.\n\n"
						+ "O outro funcionário a tranquilizou dizendo: acidentes acontecem!\n\n"
						+ "2 - O funcionário sai do carro bravo," + nome
						+ " Dizendo as seguintes palavra: tinha que ser mulher para não saber dirigir!\n\n" + nome
						+ " sentiu medo por trabalhar no mesmo local que este homem, também se sentiu frustrada por ter cometido esse deslize."));

		JOptionPane.showMessageDialog(null, "Por conta do ocorrido " + nome
				+ " acabou chegando atrasada para uma reunião, explicou toda a situação e por fim se desculpou pelo atraso.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - A equipe entendeu o ocorrido, perguntando se estava tudo bem, e a reunião prosseguiu normalmente.\n2 - "
						+ nome
						+ " ouviu piadas de mau gosto sobre o ocorrido, sentiu-se constrangida, mas como já havia se atrasado simplesmente sentou e aguardou a reunião prosseguir."));

		JOptionPane.showMessageDialog(null, "Ainda um pouco estressada após o ocorrido no início do dia " + nome
				+ " optou por comer sozinha no refeitório, não estava com muita vontade de socializar.");

	}

	public static void metodo02(String nome) {

		int opcao1;

		JOptionPane.showMessageDialog(null, "Escolha as opções a seguir");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - " + nome
				+ " almoçou tranquilamente. Seus colegas perguntaram se estava tudo bem e se precisava de alguma coisa.\n2 - Um colega de trabalho sentou-se ao seu lado, dizendo que "
				+ nome
				+ " era muito bonita para comer sozinha, e fez convites inadequados para o ambiente de trabalho."));

		JOptionPane.showMessageDialog(null,
				"Na reunião de equipe, o Senior avisa que tem um bug em algum código e sugere deixar essa demanda nas mãos do estagiário.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Como " + nome
				+ " era especialista em Java, ela se propôs a auxiliar o estagiário no Bug, fazendo com que ele aprendesse a lidar com essas situações.\n2 - Ela sugere uma solução, mas é interrompida rispidamente durante sua fala pelo seu Sênior."));

		JOptionPane.showMessageDialog(null, "O gerente da a permissão para " + nome
				+ ", e elogia sua proatividade, aumentando sua influencia na empresa.");
	}
}
