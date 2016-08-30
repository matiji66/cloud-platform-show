package com.pateo.cloud.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pateo.cloud.dao.DistrictDao;
import com.pateo.cloud.domain.District;
import com.pateo.cloud.domain.Province;
import com.pateo.cloud.queryvo.DistrictQueryVo;
@Repository
@Transactional
public class DistrictDaoImpl implements DistrictDao {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession() {
		   return _sessionFactory.getCurrentSession();
	}
	/**
	 * 城市列表： 1热门城市， 2普通城市
	 * 区域列表：根据城市获取区域列表
	 */
	@Override
	public List<District> getListByExample(DistrictQueryVo queryVo){
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<District> getListByUpperId(int upperId) {

		return (List<District>) getSession().createQuery(" from District where upperId =:upperId").setParameter("upperId", upperId).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<District> getListByOrderNo(int orderNo) {
		
		return (List<District>) getSession().createQuery("from District where orderNo =:orderNo").setParameter("orderNo", orderNo).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<District> getListByName(String name) {
		
		return (List<District>) getSession().createQuery("from District where name =:name").setParameter("name", name).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<District> getListByLevel(int level) {
		
		return (List<District>) getSession().createQuery("from District where level =:level").setParameter("level", level).list();
	}
	@Override
	public District select(int id) {

		return (District) getSession().load(District.class, id);
		
	}
	@Override
	public District getByName(String name) {

		return (District) getSession().createQuery("from District where name =:name").setParameter("name", name).uniqueResult();
		
	}
	@Override
	public String getNameById(int id) {
		
		District district = (District) (getSession().createQuery(" from District where id =:id").setParameter("id", id).uniqueResult());
		if (district!=null) {
			return district.getName();
		}else {
			return null;
		}
	}
	@Override
	public String getUpperNameById(int id) {
		District district =(District)  getSession().load(District.class, id);
		return getNameById(district.getUpperId());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Province> getProvinceListByLevel(int level) {
		
		List<Province> list = getSession().createQuery(" from Province ").list();
		for (Province province : list) {
			System.out.println(" get from createQuery " + province);
		}
		return (List<Province>) list;
	}
	
}
