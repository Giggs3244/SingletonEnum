package co.com.prueba.model;

public class CertificadoOBL extends Certificado {

	private static CertificadoOBL certificadoOBL;

	private CertificadoOBL() {
		super();
	}

	public static CertificadoOBL getInstance() {
		if (certificadoOBL == null) {
			certificadoOBL = new CertificadoOBL();
		}
		return certificadoOBL;
	}

	@Override
	public LogTransaccional buildLogTransaccional() {
		logTransaccional.setCodProducto(6);
		logTransaccional.setCodTransaccion(8);
		return logTransaccional;
	}

	@Override
	public CertificadoPDF buildCertificadoPDF() {
		certificadoPDF.setTipoReporte("OBL");
		return certificadoPDF;
	}

}
