package datos;

import model.Armas;

public class BDArmas {

	/*
	TIPO 
	 - 1 = Arma;
	 - 2 = Acción;
	ESTADO
	 - 0 = "En mazo"; 
	 - 1 = "En mano";
	 - 2 = "En juego";
	 */
	
	// String nombre, int tipo, int estado, Efectos efecto, int alcance
	private Armas a1 = new Armas("Colt 45", 1, 0, null, 1);
	private Armas a2 = new Armas("Revolver Carabine", 1, 0, null, 4);
	private Armas a3 = new Armas("Schofield", 1, 0, null, 2);
	private Armas a4 = new Armas("Winchester", 1, 0, null, 5);
	private Armas a5 = new Armas("Remington", 1, 0, null, 3);
	private Armas a6 = new Armas("Volcanic", 1, 0, null, 1);
	private Armas a7 = new Armas("Mira Telescópica", 1, 0, null, 1);
	private Armas a8 = new Armas("Mustang", 1, 0, null, 1);
}
