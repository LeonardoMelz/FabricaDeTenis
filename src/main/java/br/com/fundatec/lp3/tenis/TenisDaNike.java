package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.Corrida;
import br.com.fundatec.lp3.tenis.TenisPersonalizado.Builder;
import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.Tecido;

public class TenisDaNike extends Tenis {

	public TenisDaNike() {
		estiloDoTenis = new Corrida();
		try {

			Builder builder = TenisPersonalizado.builder();

			TenisPersonalizado tenis;
			tenis = builder.comBorracha(Borracha.GROSSA).comTecido(Tecido.ALGODAO).build();

			System.out.println("Sendo fabricado um tenis da NIKE:");
			System.out.println("Tecido: " + tenis.getTecido());
			System.out.println("Borracha: " + tenis.getBorracha());

		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}
	}

	@Override
	public void costurar() {
		System.out.println("Costurando de fora para dentro");
	}

	@Override
	public void colocarCadarços() {
		System.out.println("Colocando cadarços esportivos");
	}

	@Override
	public void embalar() {
		System.out.println("embalando em caixa de plastico");
	}

	@Override
	public String getNome() {
		
		return "Tenis da nike";
	}
}
