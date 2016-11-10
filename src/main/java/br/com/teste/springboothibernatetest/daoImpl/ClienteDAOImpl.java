/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.springboothibernatetest.daoImpl;

import br.com.teste.springboothibernatetest.dao.ClienteDAO;
import br.com.teste.springboothibernatetest.entity.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wagnerjl
 */
@Repository
public class ClienteDAOImpl implements ClienteDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
