package com.pateo.cloud.dao.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pateo.cloud.dao.CityDao;
import com.pateo.cloud.domain.ProvinceAndCityRealtime;
import com.pateo.cloud.domain.ProvinceAndSum;
import com.pateo.cloud.utils.TimeUtils;

@Repository
@Transactional
public class CityDaoImpl implements CityDao {
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}

	@Override
	public List<Object> getIllegalList(String statustype, String carNo,
			int startPosition, int count) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(
				" select record.ID,record.CARNO,record.BREACH_DATE,record.BREACH_PLACE,record.REDUCE_SCORE,record.BREACH_INFO,record.DEAL_STATE,record.BREACH_PIC,record.FINE from cs_car_branch as record where record.DEAL_STATE ='"
						+ statustype + "' AND record.CARNO='" + carNo + "'");
		List<Object> list = getSession().createSQLQuery(sb.toString()).list();
		return list;
	}

	// select province ,sum(value) from output_province_city where device='obd'
	// group by province

	@SuppressWarnings("unchecked")
	@Override
	public List<ProvinceAndSum> getProvinceAndSumByDevice(String device) {
		StringBuffer sb = new StringBuffer(
				" select province,sum(value) as device  from ProvinceAndCity where device ='"
						+ device + "' group by province");

		List<Object> citys = (List<Object>) getSession().createSQLQuery(
				sb.toString()).list();
		// .setResultTransformer(Transformers.aliasToBean(ProvinceAndCity.class))
		List<ProvinceAndSum> list = new ArrayList<>();

		for (Object object : citys) {
			Object[] objects = (Object[]) object;
			list.add(new ProvinceAndSum((String) objects[0], Integer
					.parseInt(((BigDecimal) objects[1]).toString())));
		}
		System.out.println(" province  --------------" + citys.size());
		return list;
	}

	// select city,sum(value) from output_province_city_realtime where
	// device='obd' group by province
	@Override
	public List<ProvinceAndSum> getCityAndSumByDevice(String device) {

		StringBuffer sb = new StringBuffer(
				" select city,sum(value) as sum from output_province_city_realtime where device ='"
						+ device + "' group by province");

		@SuppressWarnings("unchecked")
		List<Object> citys = (List<Object>) getSession().createSQLQuery(
				sb.toString()).list();
		List<ProvinceAndSum> list = new ArrayList<>();

		for (Object object : citys) {
			Object[] objects = (Object[]) object;
			list.add(new ProvinceAndSum((String) objects[0], Integer
					.parseInt(((BigDecimal) objects[1]).toString())));
		}
		System.out.println(" city --------------" + citys.size());
		return list;
	}

	@Override
	public List<ProvinceAndSum> getTimeAndCntByDevice(String device) {
		// select TIME,cnt from output_active_cnt where device='obd' order by
		// time desc limit 24
		StringBuffer sb = new StringBuffer(
				" select time,cnt from output_active_cnt where device ='"
						+ device + "' order by time desc limit 24 ");

		@SuppressWarnings("unchecked")
		List<Object> citys = (List<Object>) getSession().createSQLQuery(
				sb.toString()).list();
		List<ProvinceAndSum> list = new ArrayList<>();
		for (Object object : citys) {
			Object[] objects = (Object[]) object;
			list.add(new ProvinceAndSum(((Timestamp) objects[0]).toString(),
					Integer.parseInt(((Integer) objects[1]).toString())));
		}
		System.out.println(" city --------------" + citys.size());
		return list;
	}

	@Override
	public List<ProvinceAndSum> getPeriodCount() {

		StringBuffer sb = new StringBuffer(
				" select * from obd_timeseq_count where  timeseq >  from_unixtime(unix_timestamp() - 3600) order by timeseq desc limit 1800 ");
		@SuppressWarnings("unchecked")
		List<Object> citys = (List<Object>) getSession().createSQLQuery(
				sb.toString()).list();
		List<ProvinceAndSum> list = new ArrayList<>();
		List<ProvinceAndSum> list2 = new ArrayList<>();

		Object[] objects = (Object[]) citys.get(0);
		String timeSeq = ((String) objects[0]).toString();

		int sub = Integer.parseInt(timeSeq.substring(18, 19));
		if (sub % 2 == 0) {
			list.add(new ProvinceAndSum(timeSeq, Integer
					.parseInt(((Integer) objects[1]).toString())));
		} else {
			list.add(new ProvinceAndSum(timeSeq.substring(1, 18) + (sub - 1),
					Integer.parseInt(((Integer) objects[1]).toString())));
		}

		for (int i = 1; i < citys.size(); i++) {
			  objects = (Object[]) citys.get(i);
			  timeSeq = TimeUtils.addSeconds(timeSeq, -2);
				if (sub % 2 == 0) {
					list.add(new ProvinceAndSum(timeSeq, Integer.parseInt(((Integer) objects[1]).toString())));
				} else {
					list.add(new ProvinceAndSum(timeSeq.substring(1, 18)+ (sub - 1), Integer.parseInt(((Integer) objects[1]).toString())));
				}

			}
 
//		for (Object object : citys) {
//			Object[] objects = (Object[]) object;
//
//			String timeSeq = ((String) objects[0]).toString();
//			if (Integer.parseInt(timeSeq.substring(18, 19)) % 2 == 0) {
//				list.add(new ProvinceAndSum(timeSeq, Integer.parseInt(((Integer) objects[1]).toString())));
//
//			} else {
//				list.add(new ProvinceAndSum(timeSeq, Integer.parseInt(((Integer) objects[1]).toString())));
//			}
//		}
		System.out.println(" city --------------" + citys.size());
		return list;

	}
}
