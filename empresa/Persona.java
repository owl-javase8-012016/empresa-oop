package empresa;

public class Persona implements PersonaInterface {

	private String nombrePersona;
	private String apellidoPersona;
	private int edad;
	private String sexo;
	private String tipoDePersona;
	private String documentoDeIdentidad;

	public Persona() {
	}

	public String getNombre() {
		return this.nombrePersona;
	}

	public void setNombre(String nombre) {
		this.nombrePersona = nombre;
	}

	public String getApellido() {
		return this.apellidoPersona;
	}

	public void setApellido(String apellido) {
		this.apellidoPersona = apellido;
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

	public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
		this.documentoDeIdentidad=documentoDeIdentidad;
	}

	@Override
	public String toString() {
		return nombrePersona + " " + apellidoPersona + "; " + sexo + "; Documento " + documentoDeIdentidad;
	}
}