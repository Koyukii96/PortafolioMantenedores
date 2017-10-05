package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Ejecutivo;

@Repository
public class EjecutivoDAOImpl implements EjecutivoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addEjecutivo(Ejecutivo ejecutivo) {
		sessionFactory.getCurrentSession().saveOrUpdate(ejecutivo);

	}

	@SuppressWarnings("unchecked")
	public List<Ejecutivo> getAllEjecutivo() {

		return sessionFactory.getCurrentSession().createQuery("from Ejecutivo")
				.list();
	}

	@Override
	public void deleteEjecutivo(Integer ejecutivoId) {
		Ejecutivo ejecutivo = (Ejecutivo) sessionFactory.getCurrentSession().load(
				Ejecutivo.class, ejecutivoId);
		if (null != ejecutivo) {
			this.sessionFactory.getCurrentSession().delete(ejecutivo);
		}

	}

	public Ejecutivo getEjecutivo(int ejeid) {
		return (Ejecutivo) sessionFactory.getCurrentSession().get(
				Ejecutivo.class, ejeid);
	}

	@Override
	public Ejecutivo updateEjecutivo(Ejecutivo ejecutivo) {
		sessionFactory.getCurrentSession().update(ejecutivo);
		return ejecutivo;
	}
}