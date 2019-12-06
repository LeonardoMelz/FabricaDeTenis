package br.fundatec.lp3.fabrica;

//Criei um enum para os tipos de borracha 
//Escolhi fazer um enum para poder adicionar mais estilos de borracha se necessario
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
