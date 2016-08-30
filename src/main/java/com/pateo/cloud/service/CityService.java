package com.pateo.cloud.service;

import java.util.List;

import com.pateo.cloud.dto.ProvinceAndSumDto;

public interface CityService {


//	List<DistrictDto> getListByCityId(int cityId);
	
//	List<ProvinceDto> getProvinceList();
 	
	List<ProvinceAndSumDto> getProvinceAndSumVByObd(String device);
//	List<DistrictDto> getCityList();
//
//	List<DistrictDto> getListByCityId(int cityId, String areaName);
//
//	DistrictDto getDistByName(String name);
}
