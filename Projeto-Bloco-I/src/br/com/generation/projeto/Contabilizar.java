package br.com.generation.projeto;

public class Contabilizar {

	private int quantasEscolhas01 = 0;
	private int quantasEscolhas02 = 0;
	
	
	
	public int getQuantasEscolhas01() {
		return quantasEscolhas01;
	}

	public void setQuantasEscolhas01(int quantasEscolhas01) {
		this.quantasEscolhas01 = quantasEscolhas01;
	}

	public int getQuantasEscolhas02() {
		return quantasEscolhas02;
	}

	public void setQuantasEscolhas02(int quantasEscolhas02) {
		this.quantasEscolhas02 = quantasEscolhas02;
	}

	void somarEscolhas01() {
		this.quantasEscolhas01++;
	}
	
	void somarEscolhas02() {
		this.quantasEscolhas02++;
	}
	
}
