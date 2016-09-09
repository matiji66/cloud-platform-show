package com.pateo.cloud.service;

import java.util.List;

import com.pateo.cloud.dto.ProvinceAndSumDto;

public interface CityService {


//	List<DistrictDto> getListByCityId(int cityId);
	
//	List<ProvinceDto> getProvinceList();
 	
	List<ProvinceAndSumDto> getProvinceAndSumByObd(String device);
	
	List<ProvinceAndSumDto> getCityAndSumByObd(String device);
	List<ProvinceAndSumDto> getTimeAndCntByObd(String device);
	List<ProvinceAndSumDto> getPeriodCount();

//	List<DistrictDto> getCityList();
//
//	List<DistrictDto> getListByCityId(int cityId, String areaName);
//
//	DistrictDto getDistByName(String name);
}
