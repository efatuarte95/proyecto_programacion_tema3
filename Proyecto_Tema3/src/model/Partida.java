package model;

import vistas.Instrucciones;

public class Partida {
	private String Ganador;
	private Jugador Jugadores[];
	private String Rol[];
	private int maxBang;
	private int maxFallaste;
	private int numRondas;
	private String turnoJugador;
	private boolean finPartida=false;
	
	
	
	public Partida(String ganador, Jugador[] jugadores, String[] rol, int maxBang, int maxFallaste, int numRondas,
			String turnoJugador) {
		Ganador = ganador;
		Jugadores = jugadores;
		Rol = rol;
		this.maxBang = maxBang;
		this.maxFallaste = maxFallaste;
		this.numRondas = numRondas;
		this.turnoJugador = turnoJugador;
	}



	public String getGanador() {
		return Ganador;
	}



	public void setGanador(String ganador) {
		Ganador = ganador;
	}



	public Jugador[] getJugadores() {
		return Jugadores;
	}



	public void setJugadores(Jugador[] jugadores) {
		Jugadores = jugadores;
	}



	public String[] getRol() {
		return Rol;
	}



	public void setRol(String[] rol) {
		Rol = rol;
	}



	public int getMaxBang() {
		return maxBang;
	}



	public void setMaxBang(int maxBang) {
		this.maxBang = maxBang;
	}



	public int getMaxFallaste() {
		return maxFallaste;
	}



	public void setMaxFallaste(int maxFallaste) {
		this.maxFallaste = maxFallaste;
	}



	public int getNumRondas() {
		return numRondas;
	}



	public void setNumRondas(int numRondas) {
		this.numRondas = numRondas;
	}



	public String getTurnoJugador() {
		return turnoJugador;
	}



	public void setTurnoJugador(String turnoJugador) {
		this.turnoJugador = turnoJugador;
	}



	public boolean isFinPartida() {
		return finPartida;
	}



	public void setFinPartida(boolean finPartida) {
		this.finPartida = finPartida;
	}
	
	public void mostrarInstrucciones() {
		Instrucciones.mostrarInstrucciones();
	}
	
	public void siguienteTurno () {
	}
}
