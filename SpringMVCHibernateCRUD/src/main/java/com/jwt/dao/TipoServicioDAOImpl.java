package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.TipoServicio;

@Repository
public class TipoServicioDAOImpl implements TipoServicioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addTipoServicio(TipoServicio tipo) {
		sessionFactory.getCurrentSession().saveOrUpdate(tipo);

	}

	@SuppressWarnings("unchecked")
	public List<TipoServicio> getAllTipoServicio() {

		return sessionFactory.getCurrentSession().createQuery("from tipo_servicio")
				.list();
	}

	@Override
	public void deleteTipoServicio(Integer tipoId) {
		TipoServicio tipo = (TipoServicio) sessionFactory.getCurrentSession().load(
				TipoServicio.class, tipoId);
		if (null != tipo) {
			this.sessionFactory.getCurrentSession().delete(tipo);
		}

	}

	public TipoServicio getTipoServicio(int tipoId) {
		return (TipoServicio) sessionFactory.getCurrentSession().get(
				TipoServicio.class, tipoId);
	}

	@Override
	public TipoServicio updateTipoServicio(TipoServicio tipo) {
		sessionFactory.getCurrentSession().update(tipo);
		return tipo;
	}
}