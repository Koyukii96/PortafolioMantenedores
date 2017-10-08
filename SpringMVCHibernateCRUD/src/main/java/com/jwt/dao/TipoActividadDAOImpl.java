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
	public void addTipoActividad(TipoActividad tipoActividad) {
		sessionFactory.getCurrentSession().saveOrUpdate(tipoActividad);

	}

	@SuppressWarnings("unchecked")
	public List<TipoActividad> getAllTipoActividad() {

		return sessionFactory.getCurrentSession().createQuery("from TipoActividad")
				.list();
	}

	@Override
	public void deleteTipoActividad(Integer tipoActividadId) {
		TipoActividad tipoActividad = (TipoActividad) sessionFactory.getCurrentSession().load(
				TipoActividad.class, tipoActividadId);
		if (null != tipoActividad) {
			this.sessionFactory.getCurrentSession().delete(tipoActividad);
		}

	}

	public TipoActividad getTipoActividad(int tipoActividadId) {
		return (TipoActividad) sessionFactory.getCurrentSession().get(
				TipoActividad.class, tipoActividadId);
	}

	@Override
	public TipoActividad updateTipoActividad(TipoActividad tipoActividad) {
		sessionFactory.getCurrentSession().update(tipoActividad);
		return tipoActividad;
	}
}