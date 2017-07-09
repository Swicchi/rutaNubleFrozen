package com.usuario.frozen.web.rutanuble.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Usuario")
public class Usuario {
	@Id
	@Column(name="rut")
    private int rutNumero;
	@Column(name="nombre")
    private String nombre;
	@Column(name="apellidoPaterno")
    private String apellidoPaterno;
	@Column(name="apellidoMaterno")
    private String apellidoMaterno;
	@Column(name="email")
    private String email;
	@Column(name="domicilio")
    private String domicilio;
	@Column(name="clave")
    private String contrasena;
	@Column(name="numeroTelefonico")
    private int numeroTelefonico;
	@Column(name="estado")
    private int estado;
	@Column(name="tipoUsuario")
    private String tipoUsuario;
    
	
	public Usuario(int rutNumero, String nombre, String apellidoPaterno, String apellidoMaterno, String email,
			String domicilio, String contrasena, int numeroTelefonico, int estado, String tipoUsuario) {
		
		this.rutNumero = rutNumero;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.email = email;
		this.domicilio = domicilio;
		this.contrasena = contrasena;
		this.numeroTelefonico = numeroTelefonico;
		this.estado = estado;
		this.tipoUsuario = tipoUsuario;
	}
	public int getRutNumero() {
		return rutNumero;
	}
	public void setRutNumero(int rutNumero) {
		this.rutNumero = rutNumero;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
    
}
