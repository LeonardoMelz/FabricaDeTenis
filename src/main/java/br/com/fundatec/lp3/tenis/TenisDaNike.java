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
			//Escolhi a borrecha e o tecido
			tenis = builder.comBorracha(Borracha.GROSSA).comTecido(Tecido.ALGODAO).build();
			//Mostrando um texto com a borracha e o tecido escolhido
			System.out.println("Sendo fabricado um tenis da NIKE:");
			System.out.println("Tecido: " + tenis.getTecido());
			System.out.println("Borracha: " + tenis.getBorracha());

		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}
	}

	//Fiz uma motodo expecifico para cada tipo de tenis 
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

	//Retorna uma string com o nome do tenis
	@Override
	public String getNome() {
		
		return "Tenis da nike";
	}
}
