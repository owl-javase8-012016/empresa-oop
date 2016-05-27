package empresa.rrhh;

public class Vendedor extends Empleado {
	
	@Override
	public void liquidarEmpleado() {
		System.out.println("Generando liquidación vendedor...");
		System.out.println("Calculando comisiones del vendedor...");
		System.out.println("Liquidación completa.");
	}
}