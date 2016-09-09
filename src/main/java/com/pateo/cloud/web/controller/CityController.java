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
import com.pateo.cloud.domain.ProvinceAndSum;
import com.pateo.cloud.dto.CityDto;
import com.pateo.cloud.dto.ProvinceAndSumDto;
import com.pateo.cloud.dto.ProvinceDto;
import com.pateo.cloud.service.CityService;
import com.pateo.cloud.service.DistrictService;
/**
 * 访问方式  ip:port/odser/obd?obdid=obd  实例：http://10.10.13.5:8082/obdser/obd?obdid=obd
 * @author sh04595
 *
 */
@Controller
@RequestMapping(value = "/obdser")
public class CityController {
	 
	@Autowired
	private CityService cityService;
 	
	@Autowired
	private DistrictService districtService;
	 
	/**
	 * demo to test interface
	 * @return
	 */
	@RequestMapping(value = "/proList", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getProviceList() {
	
		List<ProvinceDto> list = districtService.getProvinceList();
		return  new ResultData(list,Code.STATUS_SUCCESS,"success");
	}
	
	/**
	 * select province ,sum(value) from output_province_city  where device='obd' group by province
	 * @param obdid
	 * @return
	 */
	@RequestMapping(value = "/obd", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getCityByName(@RequestParam(value = "obdid" ,required = true) String obdid) {
		List<ProvinceAndSumDto> districtDto = cityService.getProvinceAndSumByObd(obdid) ;
		return  new ResultData(districtDto,Code.STATUS_SUCCESS,"success");
	}

	/**
	 * select city,sum(value) from output_province_city_realtime where device='obd'group by province
	 * @param obdid
	 * @return
	 */
	@RequestMapping(value = "/obdrealtime", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getCityRealtimeByName(@RequestParam(value = "obdid" ,required = true) String obdid) {
		List<ProvinceAndSumDto> districtDto = cityService.getCityAndSumByObd( obdid) ;
		return  new ResultData(districtDto,Code.STATUS_SUCCESS,"success");
	}
	
	/**
	 * select TIME,cnt from output_active_cnt where device='obd' order by time desc limit 24
	 * @param obdid
	 * @return
	 */
	@RequestMapping(value = "/time", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getTimeAndCnt(@RequestParam(value = "obdid" ,required = true) String obdid) {
		List<ProvinceAndSumDto> districtDto = cityService.getTimeAndCntByObd( obdid) ;
		return  new ResultData(districtDto,Code.STATUS_SUCCESS,"success");
	}
	
	/**
	 * select TIME,cnt from output_active_cnt where device='obd' order by time desc limit 24
	 * @param obdid
	 * @return
	 */
	@RequestMapping(value = "/currcnt", method = RequestMethod.GET )
	@ResponseBody
	public ResultData getPeriodCount( ) {
		List<ProvinceAndSumDto> districtDto = cityService.getPeriodCount() ;
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
//		List<DistrictDto> list = districtService.getListByCityId(cityId,areaName);
//		return  new ResultData(list,Code.STATUS_SUCCESS,"success");
//	}
//}
