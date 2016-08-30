



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

import com.pateo.cloud.Application;
import com.pateo.cloud.dao.TestDao;
 
 
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class TestTest {
	@Autowired
	private TestDao  testDao  ;
	@Test
	public void testGetCarTypeList(){
		
	 List<com.pateo.cloud.domain.Test> list2 = testDao.getList2();
	 
		System.err.println(list2.get(0).toString()+"\n" + list2.get(1).toString());
	}
	
	  
 
 
}
