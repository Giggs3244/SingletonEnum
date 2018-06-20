package co.com.prueba.model;

public abstract class Certificado {

	protected LogTransaccional logTransaccional;
	protected CertificadoPDF certificadoPDF;

	public Certificado() {
		super();
		logTransaccional = new LogTransaccional();
		certificadoPDF = new CertificadoPDF();
	}

	public abstract LogTransaccional buildLogTransaccional();

	public abstract CertificadoPDF buildCertificadoPDF();

	@Override
	public String toString() {
		return "Certificado [logTransaccional=" + logTransaccional + ", certificadoPDF=" + certificadoPDF + "]";
	}

}
