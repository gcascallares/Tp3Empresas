package ar.edu.unlam.tp3;

public class Director extends Gerente {
	
	private Integer plusSalario;
	
	public Director(String nombre, String fechaDeCumpleaņos, Integer salario,Integer cochera, String tipoEmpleado, String sector,Integer plusSalario){
		super(nombre, fechaDeCumpleaņos, salario, cochera, sector,tipoEmpleado);
		this.plusSalario=plusSalario;
	}
	
	@Override
	public void brindarDetalles(){
		System.out.println("El nombre del gerente es " + getNombre() + ", Su fecha de nacimiento es " + getFechaDeCumpleaņos() + ",su salario es" +getSalario() + "pertenece al sector "+getSector() + ", es del tipo empleado de"+getTipoEmpleado()+",su cochera es la numero"+getCochera()+"tiene un plus en su salario de"+plusSalario);
	}

}
