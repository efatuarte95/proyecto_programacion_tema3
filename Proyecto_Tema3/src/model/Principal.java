package model;

import datos.BDPersonajes;
import vistas.Instrucciones;
import vistas.MostrarPersonajes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BDPersonajes b = new BDPersonajes ();

		Instrucciones.mostrarInstrucciones();
		MostrarPersonajes.MostrarP(b.getP2());
		
	}
	
}
