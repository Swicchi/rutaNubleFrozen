package com.usuario.frozen.web.rutanuble.entidades;

import java.util.Date;

public class TipoVehiculo  {
	private int monto;
	private int idTipoVehiculo;
	private String detalle;
	
	public TipoVehiculo(int monto, int idTipoVehiculo, String detalle) {
		this.monto = monto;
		this.idTipoVehiculo = idTipoVehiculo;
		this.detalle = detalle;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
     
}
