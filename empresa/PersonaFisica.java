package empresa;

public class PersonaFisica implements PersonaInterface {
	
	private String nombrePersonaFisica;
	private String apellidoPersonaFisica;
	private int edad;
	private String sexo;
	private String tipoDePersona;
	private String documentoDeIdentidad;

	public PersonaFisica() {
	}

	public String getNombre() {
		return this.nombrePersonaFisica;
	}

	public void setNombre(String nombre) {
		this.nombrePersonaFisica = nombre;
	}

	public String getApellido() {
		return this.apellidoPersonaFisica;
	}

	public void setApellido(String apellido) {
		this.apellidoPersonaFisica = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo=sexo;
	}

	public String getTipoDePersona() {
		return tipoDePersona;
	}

	public void setTipoDePersona(String tipoDePersona) {
		this.tipoDePersona=tipoDePersona;
	} 

	public String getDocumentoDeIdentidad() {
		return documentoDeIdentidad;
	}

	synchronized public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
		this.documentoDeIdentidad=documentoDeIdentidad;
	}

	@Override
	public String toString() {
		return nombrePersonaFisica + " " + apellidoPersonaFisica + "; " + sexo + "; Documento " + documentoDeIdentidad;
	}

	public static String getDescripcionTipo() {
		return "Persona Física";
	}
}