package com.usuario.frozen.web.rutanuble.servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import com.usuario.frozen.web.rutanuble.dao.CajeroDao;
import com.usuario.frozen.web.rutanuble.entidades.Usuario;

import javax.validation.constraints.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotEmpty;
@Service
public class CajeroService {
	@Autowired
	private CajeroDao cajeroDao;
	

	
	 @Transactional
	 public void addContact(Usuario user) {
		 cajeroDao.addUser(user);
	 }

	 @Transactional
	 public List<Usuario> listUser() {

	 return cajeroDao.listUser();
	 }
	 
	 @Transactional
	 public Usuario loginUser(String email){
		 return cajeroDao.loginUser(email);
		 
		 
	 }

	 @Transactional
	 public void removeUser(Integer rut) {
		 cajeroDao.removeUser(rut);
	 }

}
