package ClaseCurso;

import java.util.ArrayList;

public class Escuela_Internacional {

	public static void main(String[] args) {
		
		ArrayList<Curso>cursos=new ArrayList<Curso>();//Lista de cursos que imparte la academia 
		
//	1) Crea un curso llamado �Fundamentos de la programacion�
		Curso curso1=new Curso("Fundamentos de la programacion",10);
		cursos.add(curso1);
				
//	2) Crea alumnos nacionales
		AlumnoNacional alumno1=new AlumnoNacional("Marc","12345678A");
		AlumnoNacional alumno2=new AlumnoNacional("Martha","12349876C");
		AlumnoNacional alumno3=new AlumnoNacional("Laia","98765432B");
		AlumnoNacional alumno4=new AlumnoNacional("Luis","54635432T");
		
//	4) Crea alumnos extrangeros
		AlumnoErasmus alumno5=new AlumnoErasmus("Peter","ABC123456");
		AlumnoErasmus alumno6=new AlumnoErasmus("Yade","GHI986754");
		AlumnoErasmus alumno7=new AlumnoErasmus("Kate","DEF654321");
		AlumnoErasmus alumno8=new AlumnoErasmus("Jason","KLM768391");
		
//	6) inserta los alumnos al curso fundamentos...
		curso1.insertarAlumno(alumno1);
		curso1.insertarAlumno(alumno2);
		curso1.insertarAlumno(alumno3);
		curso1.insertarAlumno(alumno4);	
		curso1.insertarAlumno(alumno5);
		curso1.insertarAlumno(alumno6);
		curso1.insertarAlumno(alumno7);
		curso1.insertarAlumno(alumno8);	
//========================================================================================>> 
			
		Metodos.crearCurso(cursos);
		
		System.out.println("Aun quedan dos plazas disponibles para el curso de Fundamentos,"
				+ " agregalos:");
		
		Metodos.matricularAlumno(curso1);
		
		System.out.println("Empezamos el curso Fundamentos de la Programacion....\n");
		
		Metodos.ingresarNotas(curso1);
		Metodos.calcularPromedios(curso1);
		curso1.aprovados(cursos.get(1));
		
		System.out.println(cursos.get(1).toString());
		
		System.out.println("Empezamos el curso " + cursos.get(1).getNombre() +"....\n");
		
		Metodos.elimiarNotas(cursos.get(1));
		Metodos.ingresarNotas(cursos.get(1));
		Metodos.calcularPromedios(cursos.get(1));
		curso1.aprovados(cursos.get(1));
		
		System.out.println("<Fin del programa> :D");
		
	}

}
