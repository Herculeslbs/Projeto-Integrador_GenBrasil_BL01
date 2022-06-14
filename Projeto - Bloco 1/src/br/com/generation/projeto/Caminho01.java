package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Caminho01 {

	static Contabilizar escolhas = new Contabilizar();

	public static void contabilizar(int escolhido) {
		if (escolhido == 1) {
			escolhas.somarEscolhas01();
		} else {
			escolhas.somarEscolhas02();
		}
	}

	public static void situacao01(String nome) {

		int escolha02;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha02 = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, " + nome
							+ " deu" + " seu número e se prontificou a chamar o seguro.\n\n"
							+ "O outro funcionário a tranquilizou dizendo: acidentes acontecem!\n\n"
							+ "2 - O funcionário sai do carro bravo," + nome
							+ " Dizendo as seguintes palavra: tinha que ser mulher para não saber dirigir!\n\n" + nome
							+ " sentiu medo por trabalhar no mesmo local que este homem, tamb�m se sentiu frustrada por "
							+ "ter cometido esse deslize."));
		} while (escolha02 != 1 && escolha02 != 2);
		contabilizar(escolha02);

		JOptionPane.showMessageDialog(null, "Por conta do ocorrido " + nome
				+ " acabou chegando atrasada para uma reuni�o, explicou toda a situação e por fim se desculpou pelo atraso.");
	}

	public static void situacao02(String nome) {

		int escolha03;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha03 = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - A equipe entendeu o ocorrido, perguntando se estava tudo bem, e a reuni�o prosseguiu normalmente.\n2 - "
							+ nome
							+ " ouviu piadas de mau gosto sobre o ocorrido, sentiu-se constrangida, mas como j� havia se atrasado simplesmente sentou e aguardou a reuni�o prosseguir."));

		} while (escolha03 != 1 && escolha03 != 2);
		contabilizar(escolha03);

		JOptionPane.showMessageDialog(null, "Ainda um pouco estressada após o ocorrido no início do dia " + nome
				+ " optou por comer sozinha no refeitório, não estava com muita vontade de socializar.");

	}

	public static void situacao03(String nome) {

		int escolha04;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha04 = Integer.parseInt(JOptionPane.showInputDialog("1 - " + nome
					+ " almoçou tranquilamente. Seus colegas perguntaram se estava tudo bem e se precisava de alguma coisa.\n2 - Um colega de trabalho sentou-se ao seu lado, dizendo que "
					+ nome
					+ " era muito bonita para comer sozinha, e fez convites inadequados para o ambiente de trabalho."));
		} while (escolha04 != 1 && escolha04 != 2);
		contabilizar(escolha04);
	}

	public static void situacao04(String nome) {

		int escolha05;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha05 = Integer.parseInt(JOptionPane.showInputDialog("1 - Como " + nome
					+ " era especialista em Java, ela se prop�s a auxiliar o estagi�rio no Bug, fazendo com que ele aprendesse a lidar com essas situa��es.\n2 - Ela sugere uma solu��o, mas � interrompida rispidamente durante sua fala pelo seu S�nior."));

		} while (escolha05 != 1 && escolha05 != 2);
		contabilizar(escolha05);

		JOptionPane.showMessageDialog(null, "O gerente da a permiss�o para " + nome
				+ ", e elogia sua proatividade, aumentando sua influencia na empresa.");
	}

	public static void situacao05(String nome) {

		int escolha06;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha06 = Integer.parseInt(JOptionPane.showInputDialog("1 - " + nome
					+ " e o estagiário resolvem o bug rapidamente e já podem ir embora.\n2 - O estagiário achou muito complicado e achou melhor procurar outro programador para ajudá-lo."));

		} while (escolha06 != 1 && escolha06 != 2);
		contabilizar(escolha06);

		JOptionPane.showMessageDialog(null, "Na hora de ir embora, um colega pede uma carona para a " + nome
				+ ", ela aceita, pois esse colega mora próximo a sua residência.");
	}

	public static void situacao06(String nome) {

		int escolha07;

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha07 = Integer.parseInt(JOptionPane.showInputDialog("1 - " + Nome + " e seu colega vão conversando sobre o dia. Foi um viagem agradável.\n2 - Durante uma conversa sobre o dia, o colega de trabalho xaveca " + nome + ", e ela se irrita, pois ela só queria demonstrar um gesto de amizade."));

		} while (escolha07 != 1 && escolha07 != 2);
		contabilizar(escolha07);

	}

}
