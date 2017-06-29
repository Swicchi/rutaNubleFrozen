package com.usuario.frozen.web.rutanuble.entidades;

public class Usuario {
    private int rutNumero;
    private int rutDigitoV;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String email;
    private String domicilio;
    private String contrasena;
    private int numeroTelefonico;
    private boolean estado;
    
	public Usuario(int rutNumero, int rutDigitoV, String nombre, String apellidoPaterno, String apellidoMaterno,
			String email, String domicilio, String contrasena, int numeroTelefonico, boolean estado) {
	
		this.rutNumero = rutNumero;
		this.rutDigitoV = rutDigitoV;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.email = email;
		this.domicilio = domicilio;
		this.contrasena = contrasena;
		this.numeroTelefonico = numeroTelefonico;
		this.estado = estado;
	}
	public Usuario() {
	}
	public int getRutNumero() {
		return rutNumero;
	}
	public void setRutNumero(int rutNumero) {
		this.rutNumero = rutNumero;
	}
	public int getRutDigitoV() {
		return rutDigitoV;
	}
	public void setRutDigitoV(int rutDigitoV) {
		this.rutDigitoV = rutDigitoV;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    
    
}
