package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.EstiloDoTenis;
//Criei a classe abstract tenis para estender para todas as marcas de tenis 


public abstract class Tenis {
//todas as marcas vão ter um estilo de tenis 
	protected EstiloDoTenis estiloDoTenis;

	public abstract String getNome();

	public void estiloDoTenis() {
		estiloDoTenis.executar();
	}
	
//todas as marcas vão ter esses metodos
	public abstract void costurar();

	public abstract void colocarCadarços();

	public abstract void embalar();

}
