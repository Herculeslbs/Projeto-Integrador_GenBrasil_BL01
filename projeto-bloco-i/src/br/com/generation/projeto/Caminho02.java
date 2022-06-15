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

	
	public static void situacao01(String nome) 
	{

		JOptionPane.showMessageDialog(null, "Responda baseado no que você vê ou imagina que aconteceria normalmente");
		do
		{
			escolha = Integer.parseInt(
				JOptionPane.showInputDialog("ficou preocupada em se atrasar para o trabalho, então "
											+ "colocou rapidamente um shorts e uma blusa que encontrou e resolveu colocar "
											+ "\n\n"
											+ "1 - Foi ao trabalho sem intercorrências\n"
											+ "2 - No ônibus, percebeu alguns olhares por conta de sua "
											+ "roupa e se sentiu desconfortável"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao02(nome);
	}
	
	
	public static void situacao02(String nome) 
	{
		
		do
		{
			escolha = Integer.parseInt(
				JOptionPane.showInputDialog(nome + " chegou na empresa e foi ao banheiro se trocar, avisando a todos "
											+ "que por conta de seus compromissos tinha acordado atrasada.\n\n"
											+ "1 - Seus colegas de trabalho compreenderam o motivo, estão todos "
											+ "sobrecarregados, então imprevistos podem ocorrer\n"
											+ "2 - Seus colegas de trabalho não acreditaram em suas palavras e acham "
											+ "que aquilo foi uma falta de comprometimento com as regras da empresa"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao03(nome);
	}
	
	
	public static void situacao03(String nome) 
	{
		
		do
		{
			escolha = Integer.parseInt(
					JOptionPane.showInputDialog("Numa reunião, "+ nome +" traz uma nova proposta para o projeto.\n\n"
												+ "1 - Seus colegas de trabalho aprovam as suas sugestões e a parabenizam "
												+ "pela ideia\n"
												+ "2 - Um colega de trabalho repete a sugestão de "+ nome +" e lhe é atribuido "
												+ "o crédito"));
		}
		while(escolha != 1 && escolha != 2);
		contabilizar(escolha);
		
		
		situacao04(nome);
	}
		
		
	public static void situacao04(String nome) 
	{
			
		do 
		{
			escolha = Integer.parseInt(
					JOptionPane.showInputDialog(nome +" e seu time saíram para almoçar, em certo momento um de seus colegas "
												+"fez uma piada machista.\n\n"
												+"1- "+ nome +", a única mulher da equipe, fala que se sentiu desconfortavel "
												+"com a piada. Seus colegas se retratam com ela.\n"
												+"2- "+ nome +", a única mulher da equipe, fala que se sentiu desconfortavel "
												+"com a piada. Sua equipe não se importa com seus sentimentos."));
		}
		while(escolha != 1 && escolha!= 2);
		contabilizar(escolha);
		
		
		situacao05(nome);
	}
		
		
	public static void situacao05(String nome) 
	{
			
			do 
			{
				escolha = Integer.parseInt(
						JOptionPane.showInputDialog("Na reunião de equipe, o gerente avisa que tem um bug em algum código e sugere "
													+"deixar essa demanda na mão do estagiário.\n\n"
													+"1- Como "+ nome +" era especialista em Java, ela se propôs a auxiliar o estagiário "
													+"no Bug, fazendo com que ele aprendesse a lidar com essas situações.\n"
													+"2- Ela sugere uma solução, mas é interrompida rapidamente durante sua fala pelo "
													+"seu gerente."));
			}
			while(escolha != 1 && escolha!= 2);
			contabilizar(escolha);
			
			
			situacao06(nome);
	}

	
	public static void situacao06(String nome) 
	{
			
			do 
			{
				escolha = Integer.parseInt(
						JOptionPane.showInputDialog("Depois de um dia de muito trabalho, decidiu ir para casa através de aplicativo, "
													+"para descansar no caminho.\n\n"
													+"1- Teve uma viagem tranquila para casa e o motorista foi super simpático e  "
													+"profissional, deixando a viagem confortável.\n"
													+"2- No caminho, o motorista puxou assuntos íntimos e "+ nome +" se sentiu incomodada "
													+"e com medo durante o trajeto."));
			}
			while(escolha != 1 && escolha!= 2);
			contabilizar(escolha);
	}
		
}
