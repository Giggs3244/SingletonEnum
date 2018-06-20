package co.com.prueba.model;

public class LogTransaccional {

	private Integer codTransaccion;
	private Integer codProducto;

	public LogTransaccional() {
		super();
	}

	public Integer getCodTransaccion() {
		return codTransaccion;
	}

	public void setCodTransaccion(Integer codTransaccion) {
		this.codTransaccion = codTransaccion;
	}

	public Integer getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(Integer codProducto) {
		this.codProducto = codProducto;
	}

	@Override
	public String toString() {
		return "LogTransaccional [codTransaccion=" + codTransaccion + ", codProducto=" + codProducto + "]";
	}

}
