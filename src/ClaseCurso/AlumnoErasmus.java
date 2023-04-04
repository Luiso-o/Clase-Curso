package ClaseCurso;

public class AlumnoErasmus extends Alumno {

	private String pasaporte;
	
	public AlumnoErasmus(String nombre, String pasaporte) {
		
		super(nombre);
		super.notaFinal=calcularNotaFinal();
		this.pasaporte = pasaporte;
		
	}
	
	public String getPasaporte() {
		return pasaporte;
	}
	
	public int calcularNotaFinal() {
		
		double notas=0;
		double notaFinal = 0;
		
		for(int i=0; i<super.getNotas().size(); i++) {
			
			if(super.getNotas().get(i)%2==0) {
				
				notas=super.getNotas().get(i)*2;
				
			}else {
				
				notas=super.getNotas().get(i)/2;
			}
			
			notaFinal+=notas;
			
		}
		
		this.notaFinal=(int) Math.ceil(notaFinal/super.getNotas().size());
		
		return this.notaFinal;
		
	}

	@Override
	public String toString() {
		return super.toString() + " y PASAPORTE numero " + pasaporte 
				+ ".\nTiene un promedio de " + calcularNotaFinal() + " puntos.";
	}
	
}
