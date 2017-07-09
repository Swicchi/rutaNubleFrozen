package com.usuario.frozen.web.rutanuble.dao;
import java.util.List;
import com.usuario.frozen.web.rutanuble.entidades.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CajeroDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addUser(Usuario user) {
		sessionFactory.getCurrentSession().save(user);
	 }
	public List<Usuario> listUser() {
		return sessionFactory.getCurrentSession().createQuery("from Usuario")
				.list();
	 }
	public Usuario loginUser(String email){
		return (Usuario) sessionFactory.getCurrentSession().createQuery("from Usuario where email="+email);
	}
	public void removeUser(Integer rut) {
		Usuario user = (Usuario) sessionFactory.getCurrentSession().load(
		Usuario.class, rut);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}
	}
}
