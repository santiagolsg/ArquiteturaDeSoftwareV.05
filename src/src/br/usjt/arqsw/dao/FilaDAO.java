package br.usjt.arqsw.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Fila;
/**
 * 
 *  @author LEONARDO SANTIAGO GON�ALVES 81612334 SIN3AM-MCA
 */

@Repository
public class FilaDAO {
	@PersistenceContext
	EntityManager manager;

	@SuppressWarnings("unchecked")
	public List<Fila> listarFilas(){
		return manager.createQuery("select f from Fila f").getResultList();
	}

	
	public void atualizar(Fila fila) {
		manager.merge(fila);
	}

	
	public void remover(Fila fila) {
		manager.remove(fila);
	}

	
	
	public Fila selecionar(int id) {
		return manager.find(Fila.class, id);
	}

	
	
	public void cadastrarChamado(Fila fila){
		manager.persist(fila);
	}
}
