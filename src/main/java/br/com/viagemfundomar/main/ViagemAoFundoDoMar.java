package br.com.viagemfundomar.main;

import java.util.Scanner;

import br.com.viagemfundomar.helper.ViagemAoFundoDoMarHelper;
import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMar {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			System.out.println("Digite o comando e em seguida pressione Enter: ");
			scan = new Scanner(System.in);
			String comando = scan.nextLine();
			
			char[] coordenadas = new char[comando.length()];
			coordenadas = comando.toCharArray();
			
			Submarino submarino = new Submarino();
			
			ViagemAoFundoDoMarHelper helper = new ViagemAoFundoDoMarHelper();
			helper.calcularInstrucoes(coordenadas, submarino);
			System.out.println(submarino.toString());

		}finally {
			scan.close();
		}
	}

}
