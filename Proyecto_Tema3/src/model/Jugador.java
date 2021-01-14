package model;

import java.util.Arrays;

public class Jugador {

	// ATRIBUTOS
	private String nombre;
	private int indexRol;
	private Personaje personaje;
	private Cartas cartas[];
	private int bangsJugador;
	private int fallastesJugador;
	
	// CONSTRUCTOR
	public Jugador(String nombre, int indexRol, Personaje personaje, Cartas[] cartas, int bangsJugador,
			int fallastesJugador) {
		this.nombre = nombre;
		this.indexRol = indexRol;
		this.personaje = personaje;
		this.cartas = cartas;
		this.bangsJugador = bangsJugador;
		this.fallastesJugador = fallastesJugador;
	}

	// GETTERS & SETTERS 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIndexRol() {
		return indexRol;
	}

	public void setIndexRol(int indexRol) {
		this.indexRol = indexRol;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Cartas[] getCartas() {
		return cartas;
	}

	public void setCartas(Cartas[] cartas) {
		this.cartas = cartas;
	}

	public int getBangsJugador() {
		return bangsJugador;
	}

	public void setBangsJugador(int bangsJugador) {
		this.bangsJugador = bangsJugador;
	}

	public int getFallastesJugador() {
		return fallastesJugador;
	}

	public void setFallastesJugador(int fallastesJugador) {
		this.fallastesJugador = fallastesJugador;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", indexRol=" + indexRol + ", personaje=" + personaje + ", Cartas="
				+ Arrays.toString(cartas) + ", bangsJugador=" + bangsJugador + ", fallastesJugador=" + fallastesJugador
				+ "]";
	}
	
	
}
