package ejeguia6hernciasimple_empleado_cliente.modelo;

import java.time.LocalDate;

public class Cliente extends Persona {
private String cuit;
private float limiteDeCredito;
public Cliente(String nombre, String apellido, long dni, LocalDate fechaNacimeinto, String cuit,
		float limiteDeCredito) {
	super(nombre, apellido, dni, fechaNacimeinto);
	this.cuit = cuit;
	this.limiteDeCredito = limiteDeCredito;
}
public String getCuit() {
	return cuit;
}
public void setCuit(String cuit) {
	this.cuit = cuit;
}
public float getLimiteDeCredito() {
	return limiteDeCredito;
}
public void setLimiteDeCredito(float limiteDeCredito) {
	this.limiteDeCredito = limiteDeCredito;
}
@Override
public String hablar() {
	return "Hablo y soy un cliente";
}

public boolean estadoCredito() { 
	if(limiteDeCredito<=1000) {
		return false;
	}
		else {
			return true;
		}
		
	
}
}




