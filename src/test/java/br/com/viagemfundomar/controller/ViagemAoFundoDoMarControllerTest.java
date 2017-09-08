package br.com.viagemfundomar.controller;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.viagemfundomar.helper.ViagemAoFundoDoMarHelper;
import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMarControllerTest {

	
	private ViagemAoFundoDoMarHelper helper;
	
	@Before
	public void setUp() {
		helper = new ViagemAoFundoDoMarHelper();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalcularInstrucoes() {
		String instrucao = "RMMLMMMDDLL";
		
		char[] coordenadas = new char[instrucao.length()];
		coordenadas = instrucao.toCharArray();
		
		Submarino submarino = new Submarino();
		
		helper.calcularInstrucoes(coordenadas, submarino);
		
		assertTrue("2 3 -2 SUL".equals(submarino.getPosicao()));
	}

}
