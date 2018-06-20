package co.com.prueba;

import co.com.prueba.model.Certificado;
import co.com.prueba.model.CertificadoEnum;

public class Principal {

	public static void main(String[] args) {

		Certificado certificado = CertificadoEnum.AFI_OBL.getCertificado();
		certificado.buildCertificadoPDF();
		certificado.buildLogTransaccional();

		System.out.println(certificado);

	}

}
