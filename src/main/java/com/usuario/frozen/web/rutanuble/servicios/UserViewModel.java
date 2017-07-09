package com.usuario.frozen.web.rutanuble.servicios;

import javax.validation.constraints.Size;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotEmpty;

public class UserViewModel {
protected final Log logger = LogFactory.getLog(getClass());
    
    @NotEmpty(message="Ingrese correo del usuario")
    private String correo;
    
    @NotEmpty(message="Ingrese calve del usuario")
    @Size(min=8,message ="La contraseña debe tener 8 o más caracteres")
    private String clave;
    
    public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
		logger.info("correo set to " + correo);
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
		logger.info("clave set to " + clave);
	}
}
