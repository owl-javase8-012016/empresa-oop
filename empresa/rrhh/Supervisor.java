package empresa.rrhh;

public class Supervisor extends Empleado {

	@Override
	public void liquidarEmpleado() {
		System.out.println("Generando liquidación supervisor...");
		System.out.println("Calculando comisiones del supervisor...");
		System.out.println("Realizando cierres de zonas...");
		System.out.println("Liquidación completa.");
	}

}