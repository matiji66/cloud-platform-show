package com.pateo.cloud.assmbler;

import com.pateo.cloud.domain.District;
import com.pateo.cloud.dto.DistrictDto;

public class DistrictAssmbler {

	public static DistrictDto districtToDistrictDto(District district){
		DistrictDto districtDto = new DistrictDto();
		districtDto.setBriefNamePin(district.getBriefPinName());
		districtDto.setFullName(district.getFullName());
		districtDto.setId(district.getId());
		districtDto.setLevel(district.getLevel());
		districtDto.setName(district.getName());
		districtDto.setFullNamePin(district.getPinName());
		districtDto.setUpperId(district.getUpperId());
		districtDto.setHotFlag(district.getOrderNo()==1);
		return districtDto;
	}
	
	
}
