package com.pateo.cloud.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pateo.cloud.common.Code;
import com.pateo.cloud.common.ResultData;
import com.pateo.cloud.domain.City;
import com.pateo.cloud.domain.bean.ProvinceAndSum;
import com.pateo.cloud.dto.CityDto;
import com.pateo.cloud.dto.ProvinceAndSumDto;
import com.pateo.cloud.dto.ProvinceDto;
import com.pateo.cloud.service.CityService;
import com.pateo.cloud.service.DistrictService;
/**
 */

@Controller
@RequestMapping(value = "/obdser")
public class CityController {
	 
	@Autowired
	private CityService cityService;
 	
	@Autowired
	private DistrictService districtService;
	 
	/**
	 * to get all city List
	 * @return
	 */
	@RequestMapping(value = "/proList", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getProviceList() {
	
		List<ProvinceDto> list = districtService.getProvinceList();
		return  new ResultData(list,Code.STATUS_SUCCESS,"success");
	}
	
	/**
	 * to get dist info by name
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/obd", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getCityByName(@RequestParam(value = "obdid" ,required = true) String obdid) {
		List<ProvinceAndSumDto> districtDto = cityService.getProvinceAndSumVByObd(obdid) ;
		return  new ResultData(districtDto,Code.STATUS_SUCCESS,"success");
	}

}

//
//@Controller
//@RequestMapping(value = "/dist")
//public class DistrictController {
//	@Autowired
//	private DistrictService districtService;
//	 
//	/**
//	 * to get all city List
//	 * @return
//	 */
//	@RequestMapping(value = "/cityList", method = RequestMethod.GET )
//	@ResponseBody
//	public ResultData getCityList() {
//	
//		List<DistrictDto> list = districtService.getCityList();
//		return  new ResultData(list,Code.STATUS_SUCCESS,"success");
//	}
//	/**
//	 * to get dist info by name
//	 * @param name
//	 * @return
//	 */
//	@RequestMapping(value = "/dist", method = RequestMethod.GET )
//	@ResponseBody
//	public ResultData getCityByName(@RequestParam(value = "name" ,required = true) String name) {
//	
//		DistrictDto districtDto = districtService.getDistByName(name);
//		return  new ResultData(districtDto,Code.STATUS_SUCCESS,"success");
//	}
//	/**
//	 * to get the city's dist list
//	 * @param cityId : city Id
//	 * @param areaName: dist name
//	 * @return
//	 */
//	@RequestMapping(value = "/areaList", method = RequestMethod.GET )
//	@ResponseBody
//	public ResultData getAreaList(@RequestParam(value = "cityId" ,required = true) int cityId,
//			@RequestParam(value = "areaName" ,required = true) String areaName) {
//
//		List<DistrictDto> list = districtService.getListByCityId(cityId,areaName);
//		
//		return  new ResultData(list,Code.STATUS_SUCCESS,"success");
//	}
//
//	
//}
