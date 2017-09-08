package br.com.viagemfundomar.helper;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.viagemfundomar.helper.ViagemAoFundoDoMarHelper;
import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMarHelperTest {

	
	private ViagemAoFundoDoMarHelper helper;
	
	@Before
	public void setUp() {
		helper = new ViagemAoFundoDoMarHelper();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalcularInstrucoesParaCoordenadaDocumentada() {
		String instrucao = "RMMLMMMDDLL";
		
		char[] coordenadas = new char[instrucao.length()];
		coordenadas = instrucao.toCharArray();
		
		Submarino submarino = new Submarino();
		
		helper.calcularInstrucoes(coordenadas, submarino);
		
		assertTrue("2 3 -2 SUL".equals(submarino.getPosicao()));
		System.out.println(submarino.toString());
	}

}
