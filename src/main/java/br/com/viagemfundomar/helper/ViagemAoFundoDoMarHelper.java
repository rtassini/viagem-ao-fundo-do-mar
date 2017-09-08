package br.com.viagemfundomar.helper;

import br.com.viagemfundomar.enumarator.Direcao;
import br.com.viagemfundomar.enumarator.Instrucao;
import br.com.viagemfundomar.model.Submarino;

public class ViagemAoFundoDoMarHelper {

	public void calcularInstrucoes(char[] coordenadas, Submarino submarino){
		for (char c : coordenadas) {
			if(Instrucao.DOWN.getAbreviacao() == c){
				submarino.setZ(submarino.getZ()-1);
			} else if(Instrucao.UP.getAbreviacao() == c){
				submarino.setZ(submarino.getZ()+1);
			} else if(Instrucao.LEFT.getAbreviacao() == c){
				if(submarino.getDirecao() == 1){
					submarino.setDirecao(Direcao.OESTE.getDirecao());
				}else{
					submarino.setDirecao(submarino.getDirecao() - 1);
				}
			} else if(Instrucao.RIGHT.getAbreviacao() == c){
				if(submarino.getDirecao() == 4){
					submarino.setDirecao(Direcao.NORTE.getDirecao());
				}else{
					submarino.setDirecao(submarino.getDirecao() + 1);
				}
			}else if(Instrucao.MOVE.getAbreviacao() == c){
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
			System.out.println(submarino);
		}
	}
}
