package co.com.prueba.model;

public class CertificadoCES extends Certificado {

	private static CertificadoCES certificadoCES;

	private CertificadoCES() {
		super();
	}

	public static CertificadoCES getInstance() {
		if (certificadoCES == null) {
			certificadoCES = new CertificadoCES();
		}
		return certificadoCES;
	}

	@Override
	public LogTransaccional buildLogTransaccional() {
		logTransaccional.setCodProducto(2);
		logTransaccional.setCodTransaccion(4);
		return logTransaccional;
	}

	@Override
	public CertificadoPDF buildCertificadoPDF() {
		certificadoPDF.setTipoReporte("CES");
		return certificadoPDF;
	}

}
