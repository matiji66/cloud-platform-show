package com.pateo.cloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pateo.cloud.assmbler.DistrictAssmbler;
import com.pateo.cloud.assmbler.ProvinceAssmbler;
import com.pateo.cloud.dao.DistrictDao;
import com.pateo.cloud.domain.District;
import com.pateo.cloud.domain.Province;
import com.pateo.cloud.dto.DistrictDto;
import com.pateo.cloud.dto.ProvinceDto;
import com.pateo.cloud.service.DistrictService;
/**
 * create time : 2016 -7 -10
 * @author chunguang.yin
 * Store relative business
 */
@Service
public class DistrictServiceImpl implements DistrictService {
	@Autowired
	private DistrictDao districtDao;
	 
	
	/**
	 * get city list
	 */
	@Override
	public List<DistrictDto> getCityList() {
		List<District> list = districtDao.getListByLevel(1);
		 List<DistrictDto> distList = new ArrayList<>();
		 for(District district : list){
			 distList.add(DistrictAssmbler.districtToDistrictDto(district));
		 }
		return distList;
	}
	/**
	 * get dist by name
	 */
	@Override
	public DistrictDto getDistByName(String name) {
		District area = districtDao.getByName(name);
		if (area!=null) {
			DistrictDto districtToDistrictDto = DistrictAssmbler.districtToDistrictDto(area);
			return districtToDistrictDto;
		}
		return null;
	}
	/**
	 * get list by city id
	 */
	@Override
	public List<DistrictDto> getListByCityId(int cityId,String areaName) {
		
		District area = districtDao.getByName(areaName);
		
		 List<DistrictDto> distList = new ArrayList<>();
		List<District> list =  districtDao.getListByUpperId(cityId);
	
		 for(District district : list){
			 
					distList.add(0,DistrictAssmbler.districtToDistrictDto(district));
				
		 }
		return distList;
	}
	@Override
	public List<ProvinceDto> getProvinceList() {
		 List<Province> list = districtDao.getProvinceListByLevel( 1 ) ;
		 System.out.println(" province list size" + list.size() + "-----------------------");
		 List<ProvinceDto> distList = new ArrayList<>();
		 for(Province district : list){
			 distList.add(ProvinceAssmbler.provinceDtoToProvinceDtoDto(district));
		 }
		return distList;
	}
	
	
	
	
	

}
