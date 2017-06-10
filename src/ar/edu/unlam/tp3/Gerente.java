package ar.edu.unlam.tp3;

public class Gerente extends Empleado {
	
	private Integer cochera;
	
	public Gerente(String nombre, String fechaDeCumpleaños, Integer salario,Integer cochera, String tipoEmpleado, String sector) {
		super(nombre, fechaDeCumpleaños, salario, tipoEmpleado, sector);
		this.cochera=cochera;
	}
	
@Override
public void brindarDetalles(){
	System.out.println("El nombre del gerente es " + getNombre() + ", Su fecha de nacimiento es " + getFechaDeCumpleaños() + ",su salario es" +getSalario() + "pertenece al sector "+getSector() + ", es del tipo empleado de"+getTipoEmpleado()+",su cochera es la numero"+cochera);
}

public Integer getCochera() {
	return cochera;
}

public void setCochera(Integer cochera) {
	this.cochera = cochera;
}

}
