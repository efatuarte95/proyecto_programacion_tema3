package model;

public class Armas extends Cartas {
	
	private int alcance;

	public Armas(String nombre, int tipo, int estado, Efectos efecto, int alcance) {
		super(nombre, tipo, estado, efecto);
		this.alcance = alcance;
	}
	
}
