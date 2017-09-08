package br.com.viagemfundomar.enumarator;

public enum Instrucao {
	LEFT('L'),
	RIGHT('R'),
	MOVE('M'),
	UP('U'),
	DOWN('D');
	
	private char abreviacao;
	
	Instrucao(char abreviacao){
		this.setAbreviacao(abreviacao);
	}

	public char getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(char abreviacao) {
		this.abreviacao = abreviacao;
	}

}
