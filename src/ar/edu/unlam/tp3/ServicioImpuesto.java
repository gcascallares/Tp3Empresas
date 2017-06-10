package ar.edu.unlam.tp3;

public class ServicioImpuesto {
	private final Integer tope=10000;
	
	public Integer obtenerImpuesto(Empleado empleado){
		if(empleado.getSalario()>tope){
		empleado.setSalario(empleado.getSalario()-((empleado.getSalario()*10)/100));
		return empleado.getSalario();
		}
		return empleado.getSalario();
	}
}
