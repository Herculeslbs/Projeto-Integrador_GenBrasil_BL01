package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Caminho01 {

	public static void situacao01(String nome) {

		int opcao1;

		JOptionPane.showMessageDialog(null, "Escolha as op��es a seguir");

		opcao1 = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, "
						+ nome + " deu" + " seu n�mero e se prontificou a chamar o seguro.\n\n"
						+ "O outro funcion�rio a tranquilizou dizendo: acidentes acontecem!\n\n"
						+ "2 - O funcion�rio sai do carro bravo," + nome
						+ " Dizendo as seguintes palavra: tinha que ser mulher para n�o saber dirigir!\n\n" + nome
						+ " sentiu medo por trabalhar no mesmo local que este homem, tamb�m se sentiu frustrada por ter cometido esse deslize."));

		JOptionPane.showMessageDialog(null, "Por conta do ocorrido " + nome
				+ " acabou chegando atrasada para uma reuni�o, explicou toda a situa��o e por fim se desculpou pelo atraso.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - A equipe entendeu o ocorrido, perguntando se estava tudo bem, e a reuni�o prosseguiu normalmente.\n2 - "
						+ nome
						+ " ouviu piadas de mau gosto sobre o ocorrido, sentiu-se constrangida, mas como j� havia se atrasado simplesmente sentou e aguardou a reuni�o prosseguir."));

		JOptionPane.showMessageDialog(null, "Ainda um pouco estressada ap�s o ocorrido no in�cio do dia " + nome
				+ " optou por comer sozinha no refeit�rio, n�o estava com muita vontade de socializar.");

	}

	public static void metodo02(String nome) {

		int opcao1;

		JOptionPane.showMessageDialog(null, "Escolha as op��es a seguir");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - " + nome
				+ " almo�ou tranquilamente. Seus colegas perguntaram se estava tudo bem e se precisava de alguma coisa.\n2 - Um colega de trabalho sentou-se ao seu lado, dizendo que "
				+ nome
				+ " era muito bonita para comer sozinha, e fez convites inadequados para o ambiente de trabalho."));

		JOptionPane.showMessageDialog(null,
				"Na reuni�o de equipe, o Senior avisa que tem um bug em algum c�digo e sugere deixar essa demanda nas m�os do estagi�rio.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Como " + nome
				+ " era especialista em Java, ela se prop�s a auxiliar o estagi�rio no Bug, fazendo com que ele aprendesse a lidar com essas situa��es.\n2 - Ela sugere uma solu��o, mas � interrompida rispidamente durante sua fala pelo seu S�nior."));

		JOptionPane.showMessageDialog(null, "O gerente da a permiss�o para " + nome
				+ ", e elogia sua proatividade, aumentando sua influencia na empresa.");
	}public static void metodo02(String nome) {

		int opcao2;

		JOptionPane.showMessageDialog(null, "Escolha as op��es a seguir");

		opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Foi ao trabalho sem intercorr�ncias.\n2 - No �nibus percebeu alguns olhares por conta de sua roupa e se sentiu desconfort�vel."));

		JOptionPane.showMessageDialog(null, nome
				+ " chegou na empresa e foi ao banheiro se trocar, avisando a todos que por conta de seus compromissos tinha acordado atrasada");

		opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Seus colegas de trabalho compreenderam o motivo, est�o todos sobrecarregados, ent�o imprevistos podem ocorrer.\n2 - Seus colegas de trabalho n�o acreditaram em suas palavras e acham que aquilo foi uma falta de comprometimento com as regras da empresa."));

		JOptionPane.showMessageDialog(null, "Na reuni�o " + nome + " traz uma proposta para o projeto.");

	}
	
}
