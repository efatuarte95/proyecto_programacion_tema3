package model;

public class Personaje {
	
	// ATRIBUTOS
	private String nombre;
	private int vida;
	private int alcance;
	private Efectos efecto;
	
	// CONSTRUCTOR
	public Personaje(String nombre, int vida, int alcance, Efectos efecto) {
		this.nombre = nombre;
		this.vida = vida;
		this.alcance = alcance;
		this.efecto = efecto;
	}
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public Efectos getEfecto() {
		return efecto;
	}

	public void setEfecto(Efectos efecto) {
		this.efecto = efecto;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", alcance=" + alcance + ", efecto=" + efecto + "]";
	}
	
	public int perderVida() {
		vida--;
		return vida;
	}

}

