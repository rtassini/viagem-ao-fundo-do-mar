package br.com.viagemfundomar.model;

import br.com.viagemfundomar.enumarator.Direcao;

public class Submarino {

	private int x;
	private int y;
	private int z;
	private int direcao;
	
	public Submarino(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.direcao = Direcao.NORTE.getDirecao();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		this.direcao = direcao;
	}

	public String getPosicao() {
		return this.getX() + " " + this.getY() + " " + this.getZ()  + " " +  Direcao.fromValue(direcao);
	}
	
	@Override
	public String toString() {
		return "Submarino [x=" + x + ", y=" + y + ", z=" + z + ", direcao=" + Direcao.fromValue(direcao) + "]";
	} 
}
