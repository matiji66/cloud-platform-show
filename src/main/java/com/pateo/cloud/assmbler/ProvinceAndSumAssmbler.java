package com.pateo.cloud.assmbler;

import com.pateo.cloud.domain.bean.ProvinceAndSum;
import com.pateo.cloud.dto.ProvinceAndSumDto;

public class ProvinceAndSumAssmbler {

	public static ProvinceAndSumDto provinceAndSumToProvinceAndSumDto (ProvinceAndSum provinceAndSum){
		ProvinceAndSumDto districtDto = new ProvinceAndSumDto();
 
		districtDto.setSum(provinceAndSum.getSum());
		districtDto.setProvince( provinceAndSum.getProvince());
	 
		return districtDto;
	}
	
	
}
