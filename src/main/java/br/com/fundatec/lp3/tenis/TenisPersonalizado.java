package br.com.fundatec.lp3.tenis;

import br.fundatec.lp3.fabrica.Borracha;

import br.fundatec.lp3.fabrica.Tecido;

public class TenisPersonalizado extends Tenis {

	Borracha borracha;
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

		public Builder comTecido(Tecido tecido) {
			tenis.tecido = tecido;
			return this;
		}

		public TenisPersonalizado build() throws Exception {
			if (tenis.borracha == null) {
				throw new Exception("Borracha não informado");
			}

			if (tenis.tecido == null) {
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

	public Tecido getTecido() {
		return tecido;
	}

	public void setTecido(Tecido tecido) {
		this.tecido = tecido;
	}

}
