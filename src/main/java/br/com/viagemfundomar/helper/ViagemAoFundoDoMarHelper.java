package br.com.viagemfundomar.helper;

import br.com.viagemfundomar.enumarator.Direcao;
import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMarHelper {

	private static final char DOWN = 'D';
	private static final char UP = 'U';
	private static final char LEFT = 'L';
	private static final char RIGHT = 'R';
	private static final char MOVE = 'M';
	
	public void calcularInstrucoes(char[] coordenadas, Submarino submarino){
		for (char coordenada : coordenadas) {
			switch (coordenada) {
			case DOWN:
				submarino.setZ(submarino.getZ()-1);
				break;

			case UP:
				submarino.setZ(submarino.getZ()+1);
				break;
				
			case LEFT:
				if(submarino.getDirecao() == 1){
					submarino.setDirecao(Direcao.OESTE.getDirecao());
				}else{
					submarino.setDirecao(submarino.getDirecao() - 1);
				}
				break;
			
			case RIGHT:
				if(submarino.getDirecao() == 4){
					submarino.setDirecao(Direcao.NORTE.getDirecao());
				}else{
					submarino.setDirecao(submarino.getDirecao() + 1);
				}
				break;	
				
			case MOVE:
				moverSubmarino(submarino);
				break;
				
			default:
				break;
			}
			
			
			
		}
	}

	private void moverSubmarino(Submarino submarino) {
		if(submarino.getDirecao() == Direcao.OESTE.getDirecao()){
			submarino.setX(submarino.getX()+1);
		}else if(submarino.getDirecao() == Direcao.LESTE.getDirecao()){
			submarino.setX(submarino.getX()+1);
		}else if(submarino.getDirecao() == Direcao.NORTE.getDirecao()){
			submarino.setY(submarino.getY()+1);
		}else if(submarino.getDirecao() == Direcao.SUL.getDirecao()){
			submarino.setY(submarino.getY()-1);
		}
	}
}
