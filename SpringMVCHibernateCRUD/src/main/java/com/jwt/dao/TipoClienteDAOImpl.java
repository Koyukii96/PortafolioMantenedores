package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.TipoCliente;

@Repository
public class TipoClienteDAOImpl implements TipoClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addTipoCliente(TipoCliente tipo) {
		sessionFactory.getCurrentSession().saveOrUpdate(tipo);

	}

	@SuppressWarnings("unchecked")
	public List<TipoCliente> getAllTipoCliente() {

		return sessionFactory.getCurrentSession().createQuery("from tipo_cliente")
				.list();
	}

	@Override
	public void deleteTipoCliente(Integer tipoId) {
		TipoCliente tipo = (TipoCliente) sessionFactory.getCurrentSession().load(
				TipoCliente.class, tipoId);
		if (null != tipo) {
			this.sessionFactory.getCurrentSession().delete(tipo);
		}

	}

	public TipoCliente getTipoCliente(int tipoId) {
		return (TipoCliente) sessionFactory.getCurrentSession().get(
				TipoCliente.class, tipoId);
	}

	@Override
	public TipoCliente updateTipoCliente(TipoCliente tipo) {
		sessionFactory.getCurrentSession().update(tipo);
		return tipo;
	}
}
