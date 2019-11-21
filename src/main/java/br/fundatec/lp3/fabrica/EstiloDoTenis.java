package br.fundatec.lp3.fabrica;

public enum EstiloDoTenis {

	CORRIDA("Corrida"),
	_4MOLAS("4MOLAS"),
	REFLETIVO("Refletivo"),
	COMUM("Comum");
	
	private String titulo;
	
	EstiloDoTenis(String titulo){
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}