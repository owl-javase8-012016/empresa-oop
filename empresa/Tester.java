package empresa;

import empresa.rrhh.Vendedor;
import empresa.rrhh.Supervisor;
import empresa.rrhh.Empleado;

public class Tester {
	public static final String VERSION = "1.0.0";
	public static final String OVIDIO = "Ovidio Ovelar";
	public static final String DEHRLIS = "Derlis Romero";
	public static final String FREDYMOREL = "Fredy Morel";
	public static final String  HUGO = "Hugo Gonzalez";
	public static final String FRANCABRAL = "Francisco Cabral";
	private Empleado vendedor;
	private Empleado supervisor;

	private void instanciarClases() {
		vendedor = new Vendedor();
		vendedor.setNombre("Rafael");
		vendedor.setApellido("Benegas");
		vendedor.setEdad(28);
		vendedor.setSexo("Masculino");
		vendedor.setTipoDePersona("Física");
		vendedor.setDocumentoDeIdentidad("2384667");

		supervisor = new Supervisor();
	}

	private void describirPersona() {
		System.out.println(vendedor.toString());
		System.out.println(vendedor.getSalario());
	}

	private void liquidarVendedor() {
		vendedor.liquidarEmpleado();
	}


	private void liquidarSupervisor() {
		supervisor.liquidarEmpleado();
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		t.instanciarClases();
		t.liquidarVendedor();
		t.liquidarSupervisor();	
	}
}