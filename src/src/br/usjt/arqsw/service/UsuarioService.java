package br.usjt.arqsw.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.UsuarioDAO;
import br.usjt.arqsw.entity.Usuario;
/**
 * 
 *  @author LEONARDO SANTIAGO GON�ALVES 81612334 SIN3AM-MCA
 */

@Service
public class UsuarioService {
private UsuarioDAO dao;
	
	@Autowired
	public UsuarioService(UsuarioDAO dao) {
		this.dao = dao;
	}
	
	public Usuario logarUsuario(Usuario usuario) throws IOException{
		return dao.logarUsuario(usuario);
	}
}
