package br.fundatec.lp3.fabricaDeTenis;

import br.com.fundatec.lp3.tenis.Tenis;
import br.com.fundatec.lp3.tenis.TenisDaAdidas;
import br.com.fundatec.lp3.tenis.TenisDaFila;
import br.com.fundatec.lp3.tenis.TenisDaNike;

public class App {
	public static void main(String[] args) {

	

		Tenis tenisDaAdidas = new TenisDaAdidas();
		executa(tenisDaAdidas);
		System.out.println("\n");

		Tenis tenisDaNike = new TenisDaNike();
		executa(tenisDaNike);
		System.out.println("\n");
		
		Tenis tenisDaFila = new TenisDaFila();
		executa(tenisDaFila);
		System.out.println("\n");
	


	}

	private static void executa(Tenis tenis) {
		System.out.print(tenis.getNome() + ": ");
        tenis.colocarCadarços();
		System.out.print(tenis.getNome() + ": ");
        tenis.costurar();
		System.out.print(tenis.getNome() + ": ");
        tenis.embalar();
        
      

	}

}
