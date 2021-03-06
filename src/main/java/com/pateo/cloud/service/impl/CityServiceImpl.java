package com.pateo.cloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pateo.cloud.assmbler.ProvinceAndSumAssmbler;
import com.pateo.cloud.dao.CityDao;
import com.pateo.cloud.domain.ProvinceAndCity;
import com.pateo.cloud.domain.ProvinceAndSum;
import com.pateo.cloud.dto.ProvinceAndSumDto;
import com.pateo.cloud.service.CityService;
/**
 * create time : 2016 -7 -10
 * @author chunguang.yin
 * Store relative business
 */
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityDao districtDao;

//	List<District> list = districtDao.getListByLevel(1);
//	 List<DistrictDto> distList = new ArrayList<>();
//	 for(District district : list){
//		 distList.add(DistrictAssmbler.districtToDistrictDto(district));
//	 }
//	return distList;
	
	@Override
	public List<ProvinceAndSumDto> getProvinceAndSumByObd(String device) {
		List<ProvinceAndSum> list = districtDao.getProvinceAndSumByDevice(device);
		List<ProvinceAndSumDto> distList = new ArrayList<>();
		if (list.size() >0) {
			for (ProvinceAndSum provinceAndSum  : list) {
				distList.add(ProvinceAndSumAssmbler.provinceAndSumToProvinceAndSumDto(provinceAndSum));
 			}
		}
		return distList;
	}

	@Override
	public List<ProvinceAndSumDto> getCityAndSumByObd(String device) {
		List<ProvinceAndSum> list = districtDao.getCityAndSumByDevice(device);
		List<ProvinceAndSumDto> distList = new ArrayList<>();
		if (list.size() >0) {
			for (ProvinceAndSum provinceAndSum  : list) {
				distList.add(ProvinceAndSumAssmbler.provinceAndSumToProvinceAndSumDto(provinceAndSum));
 			}
		}
		return distList;
	}

	@Override
	public List<ProvinceAndSumDto> getTimeAndCntByObd(String device) {
		List<ProvinceAndSum> list = districtDao.getTimeAndCntByDevice(device);
		List<ProvinceAndSumDto> distList = new ArrayList<>();
		if (list.size() >0) {
			for (ProvinceAndSum provinceAndSum  : list) {
				distList.add(ProvinceAndSumAssmbler.provinceAndSumToProvinceAndSumDto(provinceAndSum));
 			}
		}
		return distList;
	}

	@Override
	public List<ProvinceAndSumDto> getPeriodCount() {

		List<ProvinceAndSum> list = districtDao.getPeriodCount( );
		List<ProvinceAndSumDto> distList = new ArrayList<>();
		if (list.size() >0) {
			for (ProvinceAndSum provinceAndSum  : list) {
				distList.add(ProvinceAndSumAssmbler.provinceAndSumToProvinceAndSumDto(provinceAndSum));
 			}
		}
		return distList;
	}
	  

}
