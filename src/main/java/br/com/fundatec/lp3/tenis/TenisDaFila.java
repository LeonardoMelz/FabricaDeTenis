package br.com.fundatec.lp3.tenis;

import br.com.fundatec.estilos.Comum;
import br.com.fundatec.lp3.tenis.TenisPersonalizado.Builder;
import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.Tecido;

public class TenisDaFila extends Tenis {

	public TenisDaFila() {
		 estiloDoTenis = new Comum();
		 try {

				Builder builder = TenisPersonalizado.builder();

				TenisPersonalizado tenis;
				tenis = builder.comBorracha(Borracha.FINA).comTecido(Tecido.ALGODAO).build();

				System.out.println("Sendo fabricado um tenis da FILA:");
				System.out.println("Tecido: " + tenis.getTecido());
				System.out.println("Borracha: " + tenis.getBorracha());

			} catch (Exception e) {
				System.out.println("Ocorreu um erro" + e.getMessage());
			}	
	
	
	}
		
		
		@Override
		public void costurar() {
			System.out.println("Costurando de dentro pra fora");
		}

		@Override
		public void colocarCadarços() {
			System.out.println("Coloando cadarço preto");
		}

		@Override
		public void embalar() {
			System.out.println("embalando em caixa de papelão");
		}
		
		@Override
		public String getNome() {
			
			return "Tenis da Fila";
		}
}
