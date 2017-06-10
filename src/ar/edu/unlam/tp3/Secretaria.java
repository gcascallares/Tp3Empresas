package ar.edu.unlam.tp3;

public class Secretaria extends Empleado {
	
	public Secretaria(String nombre,String fechaDeCumpleaños,Integer salario,String tipoEmpleado,String sector){
		super(nombre, fechaDeCumpleaños, salario, tipoEmpleado, sector);
	}
	
	@Override
	public void brindarDetalles(){
		System.out.println("El nombre de la secretaria es " + getNombre() + ", Su fecha de nacimiento es " + getFechaDeCumpleaños() + ",su salario es" +getSalario() + "pertenece al sector "+getSector() + ", es del tipo empleado de"+getTipoEmpleado());
	}
}
