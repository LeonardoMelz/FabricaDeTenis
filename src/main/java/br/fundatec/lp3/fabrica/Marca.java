package br.fundatec.lp3.fabrica;

public enum Marca {

	NIKE("Nike"),
	ADIDAS("Adidas"),
	FILA("Fila"),
	PUMA("Puma");
	
	private String titulo;
	
	Marca(String titulo){
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}