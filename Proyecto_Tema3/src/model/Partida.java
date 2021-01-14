package model;

import vistas.Instrucciones;

public class Partida {
	private String ganador;
	private Jugador Jugadores[];
	private String rol[];
	private int maxBang;
	private int maxFallaste;
	private int numRondas;
	private String turnoJugador;
	private boolean finPartida;
	
	public Partida(String ganador, Jugador[] jugadores, String[] rol, int maxBang, int maxFallaste, int numRondas,
			String turnoJugador, boolean finPartida) {
		this.ganador = ganador;
		this.Jugadores = jugadores;
		this.rol = rol;
		this.maxBang = maxBang;
		this.maxFallaste = maxFallaste;
		this.numRondas = numRondas;
		this.turnoJugador = turnoJugador;
		this.finPartida = false;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public Jugador[] getJugadores() {
		return Jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		Jugadores = jugadores;
	}

	public String[] getRol() {
		return rol;
	}

	public void setRol(String[] rol) {
		this.rol = rol;
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
	
	public void siguienteTurno () {
	}
}
