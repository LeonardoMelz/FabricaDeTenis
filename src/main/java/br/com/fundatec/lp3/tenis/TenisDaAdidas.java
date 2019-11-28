package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.Refletivo;
import br.com.fundatec.lp3.tenis.TenisPersonalizado.Builder;
import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.Tecido;

public class TenisDaAdidas extends Tenis {


	public TenisDaAdidas() {
		estiloDoTenis = new Refletivo();
		
		try {

			Builder builder = TenisPersonalizado.builder();

			TenisPersonalizado tenis;
			tenis = builder.comBorracha(Borracha.GROSSA).comTecido(Tecido.MICROFIBRA).build();

			System.out.println("Sendo fabricado um tenis da ADIDAS:");
			System.out.println("Tecido: " + tenis.getTecido());
			System.out.println("Borracha: " + tenis.getBorracha());

		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}
	}

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

	@Override
	public String getNome() {

		return "tenis da adidas";
	}
}
