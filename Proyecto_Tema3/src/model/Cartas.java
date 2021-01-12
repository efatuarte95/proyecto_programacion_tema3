package model;

public class Cartas {

	// ATRIBUTOS
	private String nombre;
	private int tipo;
	private int estado;
	
	
	// CONSTRUCTOR
	public Cartas(String nombre, int tipo, int estado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	// MÉTODOS
	@Override
	public String toString() {
		return "Cartas [nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
	
}
