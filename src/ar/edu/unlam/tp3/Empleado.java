package ar.edu.unlam.tp3;

public abstract class Empleado {
	
	private String nombre;
	private String fechaDeCumpleaños;
	private Integer salario;
	private String tipoEmpleado;
	private String sector;
	
public Empleado(String nombre,String fechaDeCumpleaños,Integer salario,String tipoEmpleado,String sector){
	this.nombre=nombre;
	this.fechaDeCumpleaños=fechaDeCumpleaños;
	this.salario=salario;
	this.tipoEmpleado=tipoEmpleado;
	this.sector=sector;
}
	
public abstract void brindarDetalles();

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFechaDeCumpleaños() {
	return fechaDeCumpleaños;
}

public void setFechaDeCumpleaños(String fechaDeCumpleaños) {
	this.fechaDeCumpleaños = fechaDeCumpleaños;
}

public Integer getSalario() {
	return salario;
}

public void setSalario(Integer salario) {
	this.salario = salario;
}

public String getTipoEmpleado() {
	return tipoEmpleado;
}

public void setTipoEmpleado(String tipoEmpleado) {
	this.tipoEmpleado = tipoEmpleado;
}

public String getSector() {
	return sector;
}

public void setSector(String sector) {
	this.sector = sector;
}


}
