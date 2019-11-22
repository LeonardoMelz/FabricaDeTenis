package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.EstiloDoTenis;


public abstract class Tenis {

	protected EstiloDoTenis estiloDoTenis;

	
	public abstract void costurar();
	
	public abstract void colocarCadarços();
	
	public abstract void embalar();
	
	public void estiloDoTenis() {
		estiloDoTenis.executar();

	}
	
}
