package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Caminho01 {

	static Contabilizar escolhas = new Contabilizar();
	static escolha;

	public static void contabilizar(int escolhido) {
		if (escolhido == 1) 
		{
			escolhas.somarEscolhas01();
		} else 
		{
			escolhas.somarEscolhas02();
		}
	}

	public static void situacao01(String nome) {

		JOptionPane.showMessageDialog(null, "O que você imagina que aconteceria a seguir normalmente");

		do {
			escolha = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, " + nome
							+ " deu" + " seu número e se prontificou a chamar o seguro.\n\n"
							+ "O outro funcionário a tranquilizou dizendo: acidentes acontecem!\n\n"
							+ "2 - O rapaz sai do carro bravo, ofendendo " + nome + ". Proferiu  palavras do tipo \"tinha "
							+ "que ser mulher...\". " + nome + " sentiu medo por trabalhar no mesmo local que ele."));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);

		
		situacao02(nome);
	}

	public static void situacao02(String nome) {

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Por conta do ocorrido " + nome + " acabou chegando atrasada para uma reunião, explicou toda a situação e por fim "
																	+ "se desculpou pelo atraso.\n\n"
																	+ "1 - A equipe entendeu o ocorrido, perguntando se estava tudo bem, e a reuni�o prosseguiu normalmente.\n"
																	+ "2 - " + nome + " ouviu piadas de mau gosto sobre o ocorrido e ficou chateada, mas manteve-se firme"));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);

		
		situacao03(nome);
	}

	public static void situacao03(String nome) {

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Ainda um pouco estressada após o ocorrido no início do dia " + nome + " optou por comer sozinha no "
																	+ "refeitório, não estava com muita vontade de socializar.\n\n"
																	+ "1 - " + nome
																	+ " almoçou tranquilamente. Seus colegas perguntaram se estava tudo bem e se precisava de alguma coisa.\n"
																	+ "2 - Um colega de trabalho sentou-se ao seu lado, dizendo que " + nome + " era muito bonita para comer "
																	+ "sozinha, e fez convites inadequados para o ambiente de trabalho."));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao04(nome);
	}

	public static void situacao04(String nome) {

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Na reunião de equipe, o gerente avisa que tem um bug em algum código e sugere deixar essa demanda nas mãos do estagiário\n\n"
																	+ "1 - Como " + nome + " era especialista em Java, ela se prop�s a auxiliar o estagi�rio no Bug, fazendo com que ele "
																	+ "aprendesse a lidar com essas situa��es.\n2 - Ela sugere uma solu��o, mas � interrompida rispidamente durante sua fala "
																	+ "pelo seu gerente, exlicando sobre a base da linguagem Java e quais seriam os prováveis problemas"));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);


		situacao05(nome);
	}

	public static void situacao05(String nome) {

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("O gerente acaba dando responsabilidade para " + nome + " e o estágiario\n\n"
																	+ "1 - " + nome	+ " e o estagiário resolvem o bug rapidamente e já podem ir embora.\n2 - O estagiário achou muito complicado "
																	+ "e achou melhor procurar outro programador para ajudá-lo."));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);

		
		situacao06(nome);
	}

	public static void situacao06(String nome) {

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Na hora de ir embora, um colega pede uma carona para a " + nome
																	+ ", ela aceita, pois esse colega mora próximo a sua residência.\n\n"
																	+ "1 - " + Nome + " e seu colega vão conversando sobre o dia. Foi um viagem "
																	+ "agradável.\n2 - Durante uma conversa sobre o dia, o colega de trabalho xaveca " 
																	+ nome + ", e ela se irrita, pois ela só queria demonstrar um gesto de amizade."));
		} while (escolha != 1 && escolha != 2);
		contabilizar(escolha);

	}

}
