package ar.edu.unlam.tp3;

public class Ingeniero extends Empleado {
	
	public Ingeniero(String nombre,String fechaDeCumpleaņos,Integer salario,String tipoEmpleado,String sector){
		super(nombre, fechaDeCumpleaņos, salario, tipoEmpleado, sector);
	}
	
	@Override
	public void brindarDetalles(){
		System.out.println("El nombre del ingeniero es " + getNombre() + ", Su fecha de nacimiento es " + getFechaDeCumpleaņos() + ",su salario es" +getSalario() + "pertenece al sector "+getSector() + ", es del tipo empleado de"+getTipoEmpleado());
	}
}

