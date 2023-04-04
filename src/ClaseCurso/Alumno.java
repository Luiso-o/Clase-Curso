package ClaseCurso;

import java.util.ArrayList;

public abstract class Alumno {
	
	protected static int idContador = 1;
	protected final int id;
	protected int notaFinal;
	protected String nombre;
	protected ArrayList<Integer>notas;
	
	public Alumno(String nombre) {
		this.nombre=nombre;
		this.id=idContador++;
		this.notaFinal=0;
		notas=new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}
	
//------------------------------------------------------>>
	
	public abstract int calcularNotaFinal();
	
	public void insertarNotas(int nota) {
		notas.add(nota);
	}
	
	@Override
	public String toString() {
		return "El/La alumno/a " + nombre + " tiene el id numero " + id;
	}
	
	
	
}
