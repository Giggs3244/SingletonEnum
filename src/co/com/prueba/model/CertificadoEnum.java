package co.com.prueba.model;

public enum CertificadoEnum {

	AFI_OBL(CertificadoOBL.getInstance()), AFI_CES(CertificadoCES.getInstance());

	private String tipoCertificado;
	private Certificado certificado;

	private CertificadoEnum(Certificado certificado) {
		this.certificado = certificado;
	}

	public String getTipoCertificado() {
		return tipoCertificado;
	}

	public Certificado getCertificado() {
		return certificado;
	}

	public Certificado getCertificadoFromTipoCertificado(String tipoCertificado) {
		CertificadoEnum certificadoEnum = CertificadoEnum.valueOf(CertificadoEnum.class, tipoCertificado);
		return certificadoEnum.certificado;
	}

}
