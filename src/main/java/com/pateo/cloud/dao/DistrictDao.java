package com.pateo.cloud.dao;

import java.util.List;




import com.pateo.cloud.domain.District;
import com.pateo.cloud.domain.Province;
import com.pateo.cloud.queryvo.DistrictQueryVo;

public interface DistrictDao {

	List<District> getListByExample(DistrictQueryVo queryVo);

	List<District> getListByUpperId(int upperId);
	
	List<District> getListByOrderNo(int orderNo );
	
	// test  
	List<Province> getProvinceListByLevel(int level);
	
	
	List<District> getListByLevel(int level);
	
	District select(int id);
	
	String getNameById(int id);
	
	String getUpperNameById(int id);

	List<District> getListByName(String name);

	District getByName(String name);
	
}
