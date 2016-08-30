package com.pateo.cloud.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pateo.cloud.dao.CityDao;
import com.pateo.cloud.dao.DistrictDao;
import com.pateo.cloud.domain.District;
import com.pateo.cloud.domain.Province;
import com.pateo.cloud.domain.bean.ProvinceAndSum;
import com.pateo.cloud.queryvo.DistrictQueryVo;
@Repository
@Transactional
public class CityDaoImpl implements CityDao {
	@Autowired
	
	private SessionFactory _sessionFactory;
	
	private Session getSession() {
		   return _sessionFactory.getCurrentSession();
	}
 
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Province> getProvinceListByLevel(int level) {
//		
//		List<Province> list = getSession().createQuery(" from Province ").list();
//		for (Province province : list) {
//			System.out.println(" get from createQuery " + province);
//		}
//		return (List<Province>) list;
//	}
//	public String getNameById(int id) {
//		
//		District district = (District) (getSession().createQuery(" from District where id =:id").setParameter("id", id).uniqueResult());
//		if (district!=null) {
//			return district.getName();
//		}else {
//			return null;
//		}
//	}
	@Override
	public List<Object> getIllegalList(String statustype, String carNo,
			int startPosition, int count) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(" select record.ID,record.CARNO,record.BREACH_DATE,record.BREACH_PLACE,record.REDUCE_SCORE,record.BREACH_INFO,record.DEAL_STATE,record.BREACH_PIC,record.FINE from cs_car_branch as record where record.DEAL_STATE ='"+statustype+"' AND record.CARNO='"+carNo+"'");
		List<Object> list=getSession().createSQLQuery(sb.toString()).list();
		return  list;
	}
	
//	select province ,sum(value) from output_province_city 
//	where device='obd'
//	group by province

	@Override
	public List<ProvinceAndSum> getByDevice(String device) {
		StringBuffer sb = new StringBuffer(" select province,sum(value) from ProvinceAndCity where device ='"+device+"' group by province");
		List<ProvinceAndSum> district =  getSession().createSQLQuery(sb.toString()).list();
		
		
//		ProvinceAndSum district =  (ProvinceAndSum) (getSession().createQuery(" province ,sum(value) from District where device =:device").setParameter("device", device).uniqueResult());
		return district;
	}
	
	
}
