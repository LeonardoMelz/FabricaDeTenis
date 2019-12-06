package br.fundatec.lp3.fabrica;

//Criei um enum para os tipos de borracha 
//Escolhi fazer um enum para poder adicionar mais estilos de tecido se necessario
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