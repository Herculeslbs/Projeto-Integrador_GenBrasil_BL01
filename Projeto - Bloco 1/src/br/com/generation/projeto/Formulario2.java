package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario2 {
	
	public static void main(String[] args) {
		
		
		String opiniaoH, feedback, feedback1;
		int check1, check2, check3, check4;
		boolean mudanca,superior=false,maisHomens=false;
		do {	
	check1 = Integer.parseInt(JOptionPane.showInputDialog("Você acredita que pode causar uma mudança no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) para não\n\n"));
		}
		while(check1 != 1 && check1 != 2);
					
	if(check1 == 1) {
		mudanca = true;
		
		} else {
			mudanca=false;
		}
	
	do {
	check2 = Integer.parseInt(JOptionPane.showInputDialog("A quantidade de homens que trabalham com você, é maior do que a quantidade de mulheres?\n\nDigite: \n\n(1) para sim\n\n(2) para não\n\n"));
	if(check2==1) {
		maisHomens=true;
	}else {
		maisHomens=false;} 
	
	JOptionPane.showMessageDialog(null, "Em 2019, a taxa de participação das mulheres com 15 anos ou maior de\r\n"
			+ "idade foi de 54,5%, enquanto entre os homens esta media chegou a 73,7%, uma diferença de 19,2 pontos percentuais. - IBGE 2019\r\n");
	
	} 
	while(check2 != 1 && check2 != 2);
	
	
	
	do {
		check3 = Integer.parseInt(JOptionPane.showInputDialog("Você já presenciou algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim\n\n(2) para não\n\n"));
		if(check3==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "Quase metade das mulheres já sofreu algum assédio sexual no trabalho, segundo pesquisa do LinkedIn e da consultoria de inovação social Think Eva [...] \n"
				+ "Entre elas, 15% pediram demissão do trabalho após o assédio. E apenas 5% delas recorrem ao RH das empresas para reportar o caso. [...] \n a "
				+ "maioria das entrevistadas que já sofreram alguma forma de assédio sexual no ambiente de trabalho são mulheres negras (52%) e que recebem entre dois e seis salários mínimos (49%).\n "
				+ "Além disso, o Norte (63%) e Centro-Oeste (55%) têm uma concentração de relatos superior às demais regiões.\r\n"
				+ "Mais de 95% das entrevistadas afirmam saber o que é assédio sexual no trabalho, mas pouco mais de 51% falam com frequência sobre o tema.\r\n");
		
		} 
		while(check3 != 1 && check3 != 2);
	
	do {
		check4 = Integer.parseInt(JOptionPane.showInputDialog("O seu salario é maior do que  de uma mulher na mesma função?\n\nDigite: \n\n(1) para sim\n\n(2) para não\n\n"));
		if(check4==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "As mulheres ganham cerca de 20% menos do que os homens no Brasil e a diferença salarial entre os gêneros segue neste patamar elevado,\n"
				+ " mesmo quando se compara trabalhadores do mesmo perfil de escolaridade e idade e na mesma categoria de ocupação. \n"
				+ "É o que mostra levantamento da consultoria IDados, com base na Pesquisa Nacional por Amostra de Domicílio do IBGE.");
				
		
		} 
		while(check4 != 1 && check4 != 2);
	
	JOptionPane.showMessageDialog(null, "Uma pesquisa do site Vagas.com mostrou que,[...] enquanto o assédio moral é equilibrado entre homens e mulheres, no sexual, elas formam 80% das vítimas.\r\n"
			+ "O assédio moral acontece quando, de forma repetitiva e prolongada, o agressor expõe o colaborador a situações humilhantes, com ofensas ou ameaças.\r\n"
			+ "Já o assédio sexual se caracteriza por contatos físicos forçados, palavras, convites, humilhações e intimidação com fundo sexual.");
	
	opiniaoH = JOptionPane.showInputDialog(null, "O que você pode fazer para diminuir a discriminação contra a mulher no seu local de trabalho?");
		
	
	if (mudanca == true) {
		JOptionPane.showMessageDialog(null, "Isso mesmo, suas atitudes  contribuem com um ambiente de trabalho melhor para a mulher: Seja sempre gentil com uma, ela poderia ser da sua família.\r\n"
				+ "Evite piadas constrangedoras de sexismo, assedio e etc.\r\n"
				+ "Não participe de brincadeiras que não cabem ao ambiente de trabalho, comunique aos superiores hierárquicos, bem como informar por meio dos canais internos da empresa,\n "
				+ "tais como ouvidoria, comitês de éticas ou outros meios idôneos disponíveis\r\n"
				+ "Se tiver algum comentário para a equipe de desenvolvimento, sobre algo que faltou no jogo, por favor comente abaixo e dê ok. Caso contrário é só cancelar.");
	} else  { 
		JOptionPane.showMessageDialog(null, "Você pode sim contribuir com um ambiente de trabalho melhor para a mulher: Seja sempre gentil com uma mulher, ela poderia ser da sua família.\r\n"
				+ "Evite piadas constrangedoras de sexismo, assedio e etc.\r\n"
				+ "Não participe de brincadeiras que não cabem ao ambiente de trabalho, comunique aos superiores hierárquicos, bem como informar por meio dos canais internos da empresa, tais como ouvidoria,\n "
				+ "comitês de éticas ou outros meios idôneos disponíveis\r\n"
				+ "Se tiver algum comentário para a equipe de desenvolvimento, sobre algo que faltou no jogo, por favor comente abaixo e dê ok. Caso contrário é só cancelar.");
	}
	
	}

}