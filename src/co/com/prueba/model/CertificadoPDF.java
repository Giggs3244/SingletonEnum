package co.com.prueba.model;

public class CertificadoPDF {

	private String tipoReporte;

	public CertificadoPDF() {
		super();
	}

	public String getTipoReporte() {
		return tipoReporte;
	}

	public void setTipoReporte(String tipoReporte) {
		this.tipoReporte = tipoReporte;
	}

	@Override
	public String toString() {
		return "CertificadoPDF [tipoReporte=" + tipoReporte + "]";
	}

}
