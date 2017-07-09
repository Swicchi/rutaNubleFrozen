package com.usuario.frozen.web.rutanuble.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Cajero")
public class Cajero extends Usuario {

	public Cajero(int rutNumero, String nombre, String apellidoPaterno, String apellidoMaterno, String email,
			String domicilio, String contrasena, int numeroTelefonico, int estado, String tipoUsuario) {
		super(rutNumero, nombre, apellidoPaterno, apellidoMaterno, email, domicilio, contrasena, numeroTelefonico, estado,
				tipoUsuario);
		// TODO Auto-generated constructor stub
	}
    
	
     
}
