package ar.edu.unlam.tp3;

public abstract class Empleado {
	
	private String nombre;
	private String fechaDeCumplea�os;
	private Integer salario;
	private String tipoEmpleado;
	private String sector;
	
public Empleado(String nombre,String fechaDeCumplea�os,Integer salario,String tipoEmpleado,String sector){
	this.nombre=nombre;
	this.fechaDeCumplea�os=fechaDeCumplea�os;
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

public String getFechaDeCumplea�os() {
	return fechaDeCumplea�os;
}

public void setFechaDeCumplea�os(String fechaDeCumplea�os) {
	this.fechaDeCumplea�os = fechaDeCumplea�os;
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
