package com.pateo.cloud.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pateo.cloud.dao.TestDao;
import com.pateo.cloud.domain.Province;
import com.pateo.cloud.domain.Test;
@Repository
@Transactional
public class TestDaoImpl implements TestDao {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession() {
		   return _sessionFactory.getCurrentSession();
	}

	@Override
	public Object getList() {
		Object list = (Object) getSession().createSQLQuery("select * from test");
		return list;
	}

	@Override
	public List<Test> getList2() {
		List<Test> list = getSession().createQuery(" from Test ").list();
		return list;
	}
	 
	
}
