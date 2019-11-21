package br.com.fundatec.lp3.tenis;

import br.fundatec.lp3.fabrica.Borracha;
import br.fundatec.lp3.fabrica.EstiloDoTenis;
import br.fundatec.lp3.fabrica.Marca;
import br.fundatec.lp3.fabrica.Tecido;
import br.fundatec.lp3.fabrica.Tenis;


public class TenisPersonalizado extends Tenis {

	Borracha borracha;
	EstiloDoTenis estiloDoTenis;
	Marca marca;
	Tecido tecido;

	private TenisPersonalizado() {

	}

	public static Builder builder() {
		return new TenisPersonalizado().new Builder();

	}

	public class Builder {

		private TenisPersonalizado tenis;

		Builder() {
			this.tenis = new TenisPersonalizado();
		}

		public Builder comBorracha(Borracha borracha) {
			tenis.borracha = borracha;
			return this;
		}

		public Builder comEstiloDoTenis(EstiloDoTenis estiloDoTenis) {
			tenis.estiloDoTenis = estiloDoTenis;
			return this;
		}

		public Builder comTecido(Tecido tecido) {
			tenis.tecido = tecido;
			return this;
		}

		public Builder comMarca(Marca marca) {
			tenis.marca = marca;
			return this;
		}
		
		public TenisPersonalizado build() throws Exception {
			if(tenis.borracha==null) {
				throw new Exception("Borracha não informado");
			}
			if(tenis.estiloDoTenis==null) {
				throw new Exception("Estilo do tenis não foi informado");
			}
			if(tenis.marca==null) {
				throw new Exception("A marca não foi informada");
			}
			if(tenis.tecido==null) {
				throw new Exception("tecido não foi informado");
			}
			
			return tenis;
			
		}
	}
	
		@Override
		public void costurar() {
			System.out.println("Costurando o Tenis");

		}


		@Override
		public void colocarCadarços() {
			System.out.println("Colocando os cadarços");

		}

		@Override
		public void embalar() {
			System.out.println("Embalando na caixa");
		}

		public Borracha getBorracha() {
			return borracha;
		}

		public void setBorracha(Borracha borracha) {
			this.borracha = borracha;
		}

		public EstiloDoTenis getEstiloDoTenis() {
			return estiloDoTenis;
		}

		public void setEstiloDoTenis(EstiloDoTenis estiloDoTenis) {
			this.estiloDoTenis = estiloDoTenis;
		}

		public Marca getMarca() {
			return marca;
		}

		public void setMarca(Marca marca) {
			this.marca = marca;
		}

		public Tecido getTecido() {
			return tecido;
		}

		public void setTecido(Tecido tecido) {
			this.tecido = tecido;
		}	
	
}
