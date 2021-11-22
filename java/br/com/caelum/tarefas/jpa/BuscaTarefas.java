package br.com.caelum.tarefas.jpa;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

import br.com.caelum.tarefas.modelo.Tarefa;



public class BuscaTarefas {
	public static void main(String[]args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerfactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select t from Tarefa as t" + "where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", true);
		
				List<Tarefa>lista = query.getResultList();
				for(Tarefa t : lista) {
					System.out.println(t.getDescricao());
				}
				manager.close();
	}

}
