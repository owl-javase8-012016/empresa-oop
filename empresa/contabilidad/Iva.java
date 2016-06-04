package empresa.contabilidad;

public enum Iva {

	IVA_10(10.0f), IVA_5(5.0f);

	private float porcentajeIva;

	Iva(float porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	public float getPorcentajeIva() {
		return this.porcentajeIva;
	}
}