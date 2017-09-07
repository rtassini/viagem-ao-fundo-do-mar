package br.com.viagemfundomar.model;


public class Submarino {

	private int x;
	private int y;
	private int z;
	private String direcao;
	
	public Submarino(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.direcao = "Norte";
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
	

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Submarino [x=" + x + ", y=" + y + ", z=" + z + ", direcao=" + direcao + "]";
	} 
}
