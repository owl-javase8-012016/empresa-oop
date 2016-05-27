package empresa.rrhh;

import empresa.Persona;

public abstract class Empleado extends Persona {
	
	private Float salario = 1600000f;

	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public void liquidarEmpleado() {
		System.out.println("Liquidación Básica de empleado");
	};
}