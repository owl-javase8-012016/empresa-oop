package empresa;

public interface PersonaInterface {
	String getNombre();
	void setNombre(String nombre);
	String getApellido();
	void setApellido(String apellido);
	int getEdad();
	void setEdad(int edad);
	String getSexo();
	void setSexo(String sexo);
	String getTipoDePersona();
	void setTipoDePersona(String tipoDePersona);
	String getDocumentoDeIdentidad();
	void setDocumentoDeIdentidad(String documentoDeIdentidad);
}