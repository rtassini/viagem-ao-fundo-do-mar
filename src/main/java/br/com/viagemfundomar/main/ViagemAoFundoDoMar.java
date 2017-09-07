package br.com.viagemfundomar.main;

import java.util.Scanner;

import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String comando = scan.nextLine();
		scan.close();
		
		Submarino submarino = new Submarino();
		System.out.println(submarino);

	}

}
