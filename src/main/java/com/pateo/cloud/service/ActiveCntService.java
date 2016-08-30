package com.pateo.cloud.service;

import java.util.List;

import com.pateo.cloud.dto.DistrictDto;
import com.pateo.cloud.dto.ProvinceDto;

public interface ActiveCntService {


//	List<DistrictDto> getListByCityId(int cityId);
	
	List<ProvinceDto> getProvinceList();

	
	List<DistrictDto> getCityList();

	List<DistrictDto> getListByCityId(int cityId, String areaName);

	DistrictDto getDistByName(String name);
}
