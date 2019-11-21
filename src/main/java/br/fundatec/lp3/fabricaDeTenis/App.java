package br.fundatec.lp3.fabricaDeTenis;

import br.com.fundatec.lp3.tenis.TenisPersonalizado;
import br.com.fundatec.lp3.tenis.TenisPersonalizado.Builder;
import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.EstiloDoTenis;
import br.fundatec.lp3.fabrica.Marca;
import br.fundatec.lp3.fabrica.Tecido;

public class App {
	public static void main(String[] args) {

		Builder builder = TenisPersonalizado.builder();

		TenisPersonalizado tenis;

		try {

			tenis = builder.comBorracha(Borracha.GROSSA).comMarca(Marca.FILA).comTecido(Tecido.MICROFIBRA)
					.comEstiloDoTenis(EstiloDoTenis.REFLETIVO).build();

			System.out.println("Sendo fabricado um tenis");
			System.out.println("Tecido: " + tenis.getTecido());
			System.out.println("Estilo do tenis: " + tenis.getEstiloDoTenis());
			System.out.println("Borracha: " + tenis.getBorracha());
			System.out.println("Marca: " + tenis.getMarca());

			tenis.costurar();
			tenis.colocarCadarços();
			tenis.embalar();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}

	}
}
