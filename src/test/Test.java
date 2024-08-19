package test;

import java.time.LocalDate;

import ejeguia6hernciasimple_empleado_cliente.modelo.Cliente;
import ejeguia6hernciasimple_empleado_cliente.modelo.Empleado;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e=new Empleado("Rober", "Ruiz", 37762826, LocalDate.of(1993, 7, 27),11223, 30.f);
		System.out.println(e.calcularEdad(LocalDate.of(1993, 7, 27)));
		System.out.println(e.calculaSueldo(1));
		System.out.println(e.hablar());
		System.out.println(e.cocinar());
		System.out.println(e.pagarCuota());
		Cliente c=new Cliente("Luis", "RUIZ",35789456,LocalDate.of(1990, 6, 9),"121212323",100000);
		c.setLimiteDeCredito(100000);
		System.out.println(c.estadoCredito());
		System.out.println(c.hablar());
	}
	

}
