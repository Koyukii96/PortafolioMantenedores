package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.TipoActividad;

@Repository
public class TipoActividadDAOImpl implements TipoActividadDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addTipoActividad(TipoActividad tipo) {
		sessionFactory.getCurrentSession().saveOrUpdate(tipo);

	}

	@SuppressWarnings("unchecked")
	public List<TipoActividad> getAllTipoActividad() {

		return sessionFactory.getCurrentSession().createQuery("from tipo_actividad")
				.list();
	}

	@Override
	public void deleteTipoActividad(Integer tipoId) {
		TipoActividad tipo = (TipoActividad) sessionFactory.getCurrentSession().load(
				TipoActividad.class, tipoId);
		if (null != tipo) {
			this.sessionFactory.getCurrentSession().delete(tipo);
		}

	}

	public TipoActividad getTipoActividad(int tipoId) {
		return (TipoActividad) sessionFactory.getCurrentSession().get(
				TipoActividad.class, tipoId);
	}

	@Override
	public TipoActividad updateTipoActividad(TipoActividad tipo) {
		sessionFactory.getCurrentSession().update(tipo);
		return tipo;
	}
}