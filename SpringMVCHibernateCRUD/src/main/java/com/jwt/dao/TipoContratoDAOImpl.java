package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.TipoContrato;

@Repository
public class TipoContratoDAOImpl implements TipoContratoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addTipoContrato(TipoContrato tipo) {
		sessionFactory.getCurrentSession().saveOrUpdate(tipo);

	}

	@SuppressWarnings("unchecked")
	public List<TipoContrato> getAllTipoContrato() {

		return sessionFactory.getCurrentSession().createQuery("from tipo_contrato")
				.list();
	}

	@Override
	public void deleteTipoContrato(Integer tipoId) {
		TipoContrato tipo = (TipoContrato) sessionFactory.getCurrentSession().load(
				TipoContrato.class, tipoId);
		if (null != tipo) {
			this.sessionFactory.getCurrentSession().delete(tipo);
		}

	}

	public TipoContrato getTipoContrato(int tipoId) {
		return (TipoContrato) sessionFactory.getCurrentSession().get(
				TipoContrato.class, tipoId);
	}

	@Override
	public TipoContrato updateTipoContrato(TipoContrato tipo) {
		sessionFactory.getCurrentSession().update(tipo);
		return tipo;
	}
}