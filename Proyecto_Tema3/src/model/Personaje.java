package model;

public class Personaje {
	
	private String Nombre;
	private int Vida;
	private int Alcance;
	private Efectos Efecto;
	
	
	public Personaje(String nombre, int vida, int alcance, Efectos efecto) {
		super();
		Nombre = nombre;
		Vida = vida;
		Alcance = alcance;
		Efecto = efecto;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getVida() {
		return Vida;
	}


	public void setVida(int vida) {
		Vida = vida;
	}


	public int getAlcance() {
		return Alcance;
	}


	public void setAlcance(int alcance) {
		Alcance = alcance;
	}


	public Efectos getEfecto() {
		return Efecto;
	}


	public void setEfecto(Efectos efecto) {
		Efecto = efecto;
	}
	
	public int perderVida() {
		Vida--;
		return Vida;
	}
}

