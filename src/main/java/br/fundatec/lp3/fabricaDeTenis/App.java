package br.fundatec.lp3.fabricaDeTenis;

import br.com.fundatec.lp3.tenis.Tenis;
import br.com.fundatec.lp3.tenis.TenisDaAdidas;
import br.com.fundatec.lp3.tenis.TenisDaFila;
import br.com.fundatec.lp3.tenis.TenisDaNike;

public class App {
	public static void main(String[] args) {

	
		//Chamo a classe do tenis q eu quero
		Tenis tenisDaAdidas = new TenisDaAdidas();
		Tenis tenisDaNike = new TenisDaNike();
		Tenis tenisDaFila = new TenisDaFila();
		
		//O executa passa como parametro o tenis que eu quero executar
		//Isso vai mostrar o estilo e os materias que vão ser usados 
		executa(tenisDaAdidas);
		System.out.println("\n");
		executa(tenisDaNike);
		System.out.println("\n");
		executa(tenisDaFila);
		System.out.println("\n");
	


	}
	//Isso vai traser os metodos da classe tenis
	//Mas os metodos vão vir de acordo com o que foi botado em cada classe em expecifico 
	
	private static void executa(Tenis tenis) {
		System.out.print(tenis.getNome() + ": ");
        tenis.colocarCadarços();
		System.out.print(tenis.getNome() + ": ");
        tenis.costurar();
		System.out.print(tenis.getNome() + ": ");
        tenis.embalar();
        
      

	}

}
