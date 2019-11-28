package br.fundatec.lp3.fabricaDeTenis;

import org.junit.Before;
import org.junit.Test;

import br.com.fundatec.lp3.tenis.Tenis;
import br.com.fundatec.lp3.tenis.TenisDaAdidas;
import br.com.fundatec.lp3.tenis.TenisDaFila;
import br.com.fundatec.lp3.tenis.TenisDaNike;

public class TestFabrica {

	TenisDaAdidas tenisDaAdidas;
	
	@Before
	public void setUp() {
		Tenis tenisDaAdidas = new TenisDaAdidas();
		executa(tenisDaAdidas);
		Tenis tenisDaFila = new TenisDaFila();
		executa(tenisDaFila);	
		Tenis tenisDaNike = new TenisDaNike();
		executa(tenisDaNike);
		
	}
	
	private void executa(Tenis tenis) {
		 tenis.colocarCadarços();
		 tenis.colocarCadarços();
		 tenis.colocarCadarços();
	}
	
	@Test
	public void deveTestarTenisDaAdidas() {
		
		
		
	}

	
}
