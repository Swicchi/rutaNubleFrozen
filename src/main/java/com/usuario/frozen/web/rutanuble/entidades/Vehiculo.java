package com.usuario.frozen.web.rutanuble.entidades;

import java.util.Date;

public class Vehiculo  {
	private int idPortico;
	private int idTipoVehiculo;
	private int idVehiculo;
	private Date fecha;
	
	public Vehiculo(int idPortico, int idTipoVehiculo, int idVehiculo, Date fecha) {
		this.idPortico = idPortico;
		this.idTipoVehiculo = idTipoVehiculo;
		this.idVehiculo = idVehiculo;
		this.fecha = fecha;
	}
	public int getIdPortico() {
		return idPortico;
	}
	public void setIdPortico(int idPortico) {
		this.idPortico = idPortico;
	}
	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
     
}
