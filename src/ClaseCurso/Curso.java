package ClaseCurso;

import java.util.ArrayList;

public class Curso {
 
	private static int contador=1;//ide de curso
	private final int curso;
	private String nombre;
	private int plazas;
	private ArrayList<Alumno>alumnos;

	public Curso(String nombre,int plazas) {
		
		this.plazas=plazas;
		this.nombre = nombre;
		alumnos=new ArrayList<Alumno>();
		curso=contador++;
		
	}
	//Metodos get y set
	public int getCurso() {
		return curso;
	}
	
	public int getPlazas() {
		return plazas;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public String getNombre() {
		return nombre;
	}
	
//	====================================================>>
	
	public void insertarAlumno(Alumno alumno) {
		alumnos.add(alumno);
		
	}
	
	public void eliminarAlumno(Alumno alumno) {
		
		if(buscarAlumno(alumno)==-1) {
			System.out.println("<<Error! X_x>> este alumno no existe ");
		}else {
			alumnos.remove(buscarAlumno(alumno));
			System.out.println(alumno.getNombre() + " ha sido eliminado del curso " + nombre+"\n");
			
		}
	}
	//Metodos clase curso
	public int buscarAlumno(Alumno alumno) {
		
		int indice=-1;
		int contador=0;

		while(contador<alumnos.size() && indice==-1){

		if(alumnos.get(contador).getNombre().equalsIgnoreCase(alumno.getNombre())){

		indice=contador;

			}
		contador++;
		}
		return indice;
	}
	
	public void mostrarAlumno(Alumno alumno) {
		System.out.println(alumnos.get(buscarAlumno(alumno)).toString()+"\n");      
	}

	public void controlaPlazas() {
		
		if(alumnos.size()>plazas) {
			
			System.out.println("Este curso est� completo, deber�s esperar que se libere una plaza");
				
				while(alumnos.size()>plazas) {
						
						alumnos.remove(alumnos.size()-1);
						
					}
			}else {
				int numero=plazas-alumnos.size();
				System.out.println("<<El curso "+ nombre + " tiene " + numero +
						" plazas disponibles>>\n");
				
			}
	}

	public void aprovados(Curso nuevo) {
		
		for(int i=0; i<alumnos.size();i++) {
			
			if(alumnos.get(i).notaFinal>=5) {
				System.out.println("El alumno " + alumnos.get(i).getNombre() +" puede pasar al siguiente nivel!\n");
				nuevo.insertarAlumno(alumnos.get(i));
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return curso + ")- " + nombre + ":\n";
	}

	
}
