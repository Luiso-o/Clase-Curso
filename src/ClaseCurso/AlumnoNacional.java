package ClaseCurso;

public class AlumnoNacional extends Alumno {

	private String dni;
	
	public AlumnoNacional(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
		super.notaFinal=calcularNotaFinal();

	}
	
	public String getDni() {
		return dni;
	}
	
	public int getNotaFinal() {
		return notaFinal;
	}

//----------------------------------------------------------->>	
	
	public int calcularNotaFinal() {
		
		double notas=0;
		double notaFinal = 0;
		
		for(int i=0; i<super.getNotas().size(); i++) {
			
			if(super.getNotas().get(i)>=5) {
				
				notas=super.getNotas().get(i)/2;
				
			}else {
				
				notas=super.getNotas().get(i);
			}
			
			notaFinal+=notas;
			
		}
		 
		this.notaFinal=(int) Math.ceil(notaFinal/super.getNotas().size());
		
		return this.notaFinal;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " y DNI numero " + dni + ".\nTiene un promedio de " 
				+ calcularNotaFinal() + " puntos.";
	}

}
