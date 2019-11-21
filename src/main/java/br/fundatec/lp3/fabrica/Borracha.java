package br.fundatec.lp3.fabrica;

public enum Borracha {

	FINA("Fina"),
	GROSSA("Grossa");
	
	private String titulo;
	
	Borracha(String titulo){
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}
