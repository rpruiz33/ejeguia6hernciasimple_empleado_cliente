package ejeguia6hernciasimple_empleado_cliente.modelo;

import java.time.LocalDate;

public class Empleado extends Persona  implements ICocinero, ISocio {
private long legajo;
private float sueldoMensual;





public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimeinto, long legajo, float sueldoMensual) {
	super(nombre, apellido, dni, fechaNacimeinto);
	this.legajo = legajo;
	this.sueldoMensual = sueldoMensual;
}

public long getLegajo() {
	return legajo;
}

public void setLegajo(long legajo) {
	this.legajo = legajo;
}

public float getSueldoMensual() {
	return sueldoMensual;
}

public void setSueldoMensual(float sueldoMensual) {
	this.sueldoMensual = sueldoMensual;
};

public float calculaSueldo(int diasAusente) {
	float porcentajeDiasPresente=((30-diasAusente)*100)/30;
	return sueldoMensual- sueldoMensual/porcentajeDiasPresente;
	
}

@Override
public String pagarCuota() {
	return "estoy pagando cuotas";
	
}

@Override
public String hablar() {
	return "estoy hablando";	
}


@Override
public String cocinar() {
	return "estoy cocinando";
}



}
