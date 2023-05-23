package pilhaDinamica;

public class CelulaPilha {
	private String elemento;
	private CelulaPilha anterior;

	public CelulaPilha() {

	}

	public CelulaPilha(String elemento, CelulaPilha anterior) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
	}

	public String getDado() {
		return this.elemento;
	}

	public void setDado(String elemento) {
		this.elemento = elemento;
	}

	public CelulaPilha getAnterior() {
		return (this.anterior);
	}

	public void setAnterior(CelulaPilha anterior) {
		this.anterior = anterior;
	}

}
