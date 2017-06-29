package com.usuario.frozen.web.rutanuble.entidades;

import java.util.Date;

public class Portico  {
	private int idPortico;
	private boolean estado;
	
	public Portico(int idPortico, boolean estado) {
		this.idPortico = idPortico;
		this.estado = estado;
	}
	public int getIdPortico() {
		return idPortico;
	}
	public void setIdPortico(int idPortico) {
		this.idPortico = idPortico;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	} 
	

	
     
}
