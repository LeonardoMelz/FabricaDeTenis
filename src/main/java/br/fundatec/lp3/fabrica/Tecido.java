package br.fundatec.lp3.fabrica;

public enum Tecido {

	MICROFIBRA("Micofibra"),
	ALGODAO("Algodão"),
	PLUSH("Plush"),
	VISCOSE("Viscose");


	
	private String titulo;
	
	Tecido(String titulo){
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}