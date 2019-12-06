package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.Refletivo;
import br.com.fundatec.lp3.tenis.TenisPersonalizado.Builder;
import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.Tecido;

public class TenisDaAdidas extends Tenis {


	public TenisDaAdidas() {
		
		//Chamei a classe com o estilo do tenis que eu quero
		estiloDoTenis = new Refletivo();
		
		try {
			//Usei o builder para definir o Tecido e a Borracha
			Builder builder = TenisPersonalizado.builder();

			
			TenisPersonalizado tenis;
			//Escolhi a borrecha e o tecido
			tenis = builder.comBorracha(Borracha.GROSSA).comTecido(Tecido.MICROFIBRA).build();

			System.out.println("Sendo fabricado um tenis da ADIDAS:");
			System.out.println("Tecido: " + tenis.getTecido());
			System.out.println("Borracha: " + tenis.getBorracha());

		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}
	}

	//Fiz uma motodo expecifico para cada tipo de tenis 
	@Override
	public void costurar() {
		System.out.println("Costurando tenis de dentro pra fora");
	}

	@Override
	public void colocarCadarços() {
		System.out.println("Colocando cadarço da adidas");
	}

	@Override
	public void embalar() {
		System.out.println("embalando em papel ecologico");
	}

	//Retorna uma string com o nome do tenis
	@Override
	public String getNome() {

		return "tenis da adidas";
	}
}
