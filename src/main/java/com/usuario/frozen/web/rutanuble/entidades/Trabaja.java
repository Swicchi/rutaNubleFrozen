package com.usuario.frozen.web.rutanuble.entidades;

import java.util.Date;

public class Trabaja  {
	private int rutNumero;
	private int idPortico;
	private Date fecha;
	public Trabaja(int rutNumero, int idPortico, Date fecha) {
		this.rutNumero = rutNumero;
		this.idPortico = idPortico;
		this.fecha = fecha;
	}
	public int getRutNumero() {
		return rutNumero;
	}
	public void setRutNumero(int rutNumero) {
		this.rutNumero = rutNumero;
	}
	public int getIdPortico() {
		return idPortico;
	}
	public void setIdPortico(int idPortico) {
		this.idPortico = idPortico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	
     
}
