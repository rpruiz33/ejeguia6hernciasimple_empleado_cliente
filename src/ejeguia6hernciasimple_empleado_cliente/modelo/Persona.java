package ejeguia6hernciasimple_empleado_cliente.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Persona {
private String nombre;
private String apellido;
private long dni;
private LocalDate fechaNacimiento;





public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimeinto) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.fechaNacimiento = fechaNacimeinto;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}




public String getApellido() {
	return apellido;
}




public void setApellido(String apellido) {
	this.apellido = apellido;
}




public long getDni() {
	return dni;
}




public void setDni(long dni) {
	this.dni = dni;
}




public LocalDate getFechaNacimeinto() {
	return fechaNacimiento;
}




public void setFechaNacimeinto(LocalDate fechaNacimeinto) {
	this.fechaNacimiento = fechaNacimeinto;
}




public int calcularEdad(LocalDate fechaNacimiento) {
     int fechaActual =-(fechaNacimiento.getYear()-2024);
   return fechaActual;
}


public abstract String hablar();
	

	


}
