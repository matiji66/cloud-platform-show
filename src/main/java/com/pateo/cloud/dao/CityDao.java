package com.pateo.cloud.dao;

import java.util.List;

import com.pateo.cloud.domain.ProvinceAndSum;




 

public interface CityDao {

//	List<City> getListByExample(CityQueryVo queryVo);

//	List<City> getListByObdid(int upperId);
//	List<City> getListByOrderNo(int orderNo );
//	List<City> getListByLevel(int level);
//	City select(int id);
//	String getNameById(int id);
//	String getUpperNameById(int id);
//	List<City> getListByName(String name);

	List<ProvinceAndSum> getProvinceAndSumByDevice(String device);
	List<ProvinceAndSum> getCityAndSumByDevice(String device);
	List<ProvinceAndSum> getTimeAndCntByDevice(String device);

	public List<Object> getIllegalList(String statustype, String carNo,int startPosition, int count) ;
	 
}
