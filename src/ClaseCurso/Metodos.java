package ClaseCurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	public static void crearCurso(ArrayList<Curso>nuevo) {
			
		nuevo.add(new Curso(pideString("Ponle un nombre al siguiente curso que deberan "
				+ "cursar los estudiantes de\nFundamentos de la programcion:"),10));
			
	}
	
	public static void matricularAlumno(Curso primero) {
		
		for(int i=0; i<2; i++) {
			
			int opcion=pideInt("<<Elije un numero>>\n1)-Nacional?\n2)-Extranjero?");
			
			if(opcion==1) {
				
				AlumnoNacional nuevoAlumno=new AlumnoNacional(pideString("Introduce nombre"),
						pideString("Introduce DNI")); 
				
					primero.insertarAlumno(nuevoAlumno);
				
						System.out.println("El alumno " + nuevoAlumno.getNombre() + " empezar� el curso "
							+ primero.getNombre() + ",\ndeber� superar este curso para poder avanzar "
									+ " al siguiente nivel.\n");
					
								primero.controlaPlazas();
				
			}else {
				
				AlumnoErasmus nuevoAlumno=new AlumnoErasmus(pideString("Introduce nombre"),
						pideString("Introduce PASAPORTE")); 
				
					primero.insertarAlumno(nuevoAlumno);
				
						System.out.println("El alumno " + nuevoAlumno.getNombre() + " empezar� el curso "
								+ primero.getNombre() + ",\ndeber� superar este curso para poder avanzar "
										+ " al siguiente nivel.\n");
						
							primero.controlaPlazas();
				
			}
			
		}	
		
	}

	public static void ingresarNotas(Curso primero) {
		
		for(int i=0; i<primero.getAlumnos().size(); i++) {
			primero.getAlumnos().get(i);
				for(int j=1; j<6 ;j++) {
					primero.getAlumnos().get(i).insertarNotas((int)Math.floor(Math.random()*(10-1+1)+(1)));	
			}
		}
		
		for(int i=0; i<primero.getAlumnos().size(); i++) {
			 System.out.println("Las notas del alumno "+primero.getAlumnos().get(i).getNombre()
					 + " son las siguientes: " +primero.getAlumnos().get(i).getNotas() + "\n");		
			
			 }
		}
	
	public static void elimiarNotas(Curso segundo) {
		
		for(int i=0; i<segundo.getAlumnos().size(); i++) {
			segundo.getAlumnos().get(i);
				for(int j=0; j<segundo.getAlumnos().get(i).getNotas().size() ;j++) {
					segundo.getAlumnos().get(i).getNotas().clear();	
			}
		}
	}
	
	public static void calcularPromedios(Curso primero) {
		
		for(int i=0; i<primero.getAlumnos().size(); i++) {
			primero.getAlumnos().get(i);
				for(int j=1; j<6 ;j++) {
					primero.getAlumnos().get(i).calcularNotaFinal();
			}
		}
		
		for(int i=0; i<primero.getAlumnos().size(); i++) {
			 System.out.println(primero.getAlumnos().get(i).toString()+"\n");		
			
			 }
		}	
	
	static int pideInt(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
}
	
	static String pideString(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextLine();
}
		
}
