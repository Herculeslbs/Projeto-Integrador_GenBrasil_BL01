package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario2 {
	
	public static void main(String[] args) {
		
		
		String opiniaoM, feedback;
		int check1, check2, check3, check4;
		boolean abuso,superior=false,maisHomens=false;
		do {	
	check1 = Integer.parseInt(JOptionPane.showInputDialog("Você acredita que pode causar uma mudança no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) para não\n\n"));
		}
		while(check1 != 1 && check1 != 2);
					
	if(check1 == 1) {
		abuso = true;
		
		} else {
			abuso=false;
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
	
	opiniaoM = JOptionPane.showInputDialog("O que você acha que pode ser feito para minimizar o abuso contra a mulher no local de trabalho? ");
	
	do {
		check3 = Integer.parseInt(JOptionPane.showInputDialog("Você já presenciou algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim\n\n(2) para não\n\n"));
		if(check3==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "Quase metade das mulheres já sofreu algum assédio sexual no trabalho, segundo pesquisa do LinkedIn e da consultoria de inovação social Think Eva [...] Entre elas, 15% pediram demissão do trabalho após o assédio. E apenas 5% delas recorrem ao RH das empresas para reportar o caso. [...] a maioria das entrevistadas que já sofreram alguma forma de assédio sexual no ambiente de trabalho são mulheres negras (52%) e que recebem entre dois e seis salários mínimos (49%). Além disso, o Norte (63%) e Centro-Oeste (55%) têm uma concentração de relatos superior às demais regiões.\r\n"
				+ "Mais de 95% das entrevistadas afirmam saber o que é assédio sexual no trabalho, mas pouco mais de 51% falam com frequência sobre o tema.\r\n");
		
		} 
		while(check2 != 1 && check2 != 2);
	
	if (abuso == true) {
		feedback = JOptionPane.showInputDialog(null, "Algumas atitudes são importantes para fazer cessar o assédio e evitar que ele se propague e se agrave no ambiente de trabalho:\r\n"
				+ " Dizer, claramente, não ao assediador; \r\n"
				+ "Evitar permanecer sozinha (o) no mesmo local que o (a) assediador (a); \r\n"
				+ "Anotar, com detalhes, todas as abordagens de caráter sexual sofridas: dia, mês, ano, hora, local ou setor, nome do (a) agressor (a), colegas que testemunharam os fatos, conteúdo das conversas e o que mais achar necessário; \r\n"
				+ "Dar visibilidade, procurando a ajuda dos colegas, principalmente daqueles que testemunharam o fato, que são ou foram vítimas; \r\n"
				+ "Reunir provas, como bilhetes, e-mails, mensagens em redes sociais, presentes.; \r\n"
				+ "Livrar-se do sentimento de culpa, uma vez que a irregularidade da conduta não depende do comportamento da vítima, mas sim do agressor; \r\n"
				+ "Denunciar aos órgãos de proteção e defesa dos direitos das mulheres ou dos trabalhadores, inclusive o sindicato profissional; \r\n"
				+ "Comunicar aos superiores hierárquicos, bem como informar por meio dos canais internos da empresa, tais como ouvidoria, comitês de éticas ou outros meios idôneos disponíveis; \r\n"
				+ "Buscar apoio junto a familiares, amigos e colegas; \r\n"
				+ "Relatar o fato perante a Cipa (Comissão Interna de Prevenção de Acidentes) e ao SESMT (Serviço Especializado em Engenharia de Segurança e em Medicina do Trabalho)\n\nObrigado por jogar!\n\nSe tiver algum comentário para a equipe de desenvolvimento, "
				+ "sobre algo que faltou no jogo, por favor comente abaixo e dê ok. Caso contrário é só cancelar.");
	} else { 
		
	}
	
	}

}