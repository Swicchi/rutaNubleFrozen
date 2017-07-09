package com.usuario.frozen.web.rutanuble.controladores;

import java.util.List;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usuario.frozen.web.rutanuble.entidades.Usuario;
import com.usuario.frozen.web.rutanuble.servicios.CajeroService;
import com.usuario.frozen.web.rutanuble.servicios.UserViewModel;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping(value="/cajero")
public class CajeroController {
	@Autowired
	private CajeroService cajeroService;
	
	protected final Log login = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
    public ModelAndView formularioCargado(@Valid UserViewModel user, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	
    {
    	
    	if(result.hasErrors()){
    		ModelAndView vista = new ModelAndView("login");
        	vista.addObject(user);
	    	vista.addObject("noUsuario", false);
	    	vista.addObject("contraseñaIncorrecta", false);
        	return vista;
    	}
    	
        String email = user.getCorreo();
        String clave = user.getClave();
        
        Usuario usuario = cajeroService.loginUser(email);
        
    	if(usuario != null){
    		if(!usuario.getContrasena().equalsIgnoreCase(clave)){
    			ModelAndView vista = new ModelAndView("login");
    	    	vista.addObject(Usuario.class);
    	    	vista.addObject("noUsuario", false);
    	    	vista.addObject("contraseñaIncorrecta", true);
    	    	return vista;
    		}
    		ModelAndView vista = new ModelAndView();
    		HttpSession session = request.getSession(true);
    		session.setAttribute("usuario", usuario);
    		if(usuario.getTipoUsuario().equalsIgnoreCase("Administrador")){
    			vista.setViewName("main2");
    		}else{
    			vista.setViewName("main");
    		}
    		vista.addObject("usuario", usuario);
			
    		return vista;
        }
    	ModelAndView vista = new ModelAndView("login");
    	vista.addObject(user);
    	vista.addObject("noUsuario", true);
    	vista.addObject("contraseñaIncorrecta", false);
    	return vista;
    }
	
	
}
