package com.pateo.cloud.assmbler;

import com.pateo.cloud.domain.Province;
import com.pateo.cloud.dto.ProvinceDto;

public class ProvinceAssmbler {

	public static ProvinceDto provinceDtoToProvinceDtoDto(Province district){
		ProvinceDto districtDto = new ProvinceDto();
 
		districtDto.setId(district.getId());
		districtDto.setName(district.getName());
	 
		return districtDto;
	}
	
	
}
