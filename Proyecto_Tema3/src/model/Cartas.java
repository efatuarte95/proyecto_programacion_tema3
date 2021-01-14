package model;

public class Cartas {

	// ATRIBUTOS
	private String nombre;
	private int tipo;
	private int estado;
	private Efectos efecto;
	
	
	// CONSTRUCTOR
	public Cartas(String nombre, int tipo, int estado, Efectos efecto) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
		this.efecto = efecto;
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
	
	public Efectos getEfecto() {
		return efecto;
	}

	public void setEfecto(Efectos efecto) {
		this.efecto = efecto;
	}

	// MÉTODOS
	
	@Override
	public String toString() {
		return "Cartas [nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
}
