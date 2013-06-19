package com.expedia.lux.content.mainClass;


import java.util.Date;
import java.util.UUID;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.expedia.lux.content.dal.PhotoDal;
import com.expedia.lux.content.dto.ChangeRequest;
import com.expedia.lux.content.dto.ChangeRequestCompoundKey;


public class KunderaExample {
	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});
		 UUID chReqId = UUID.randomUUID();
		 UUID SubId = UUID.randomUUID();
		 
	        Date currentDate = new Date();

		PhotoDal c = (PhotoDal)context.getBean("photoDal");
	    	
		c.GetMediaCategoryGroup();
		c.GetMediaCategory(1);
		
		ChangeRequestCompoundKey cck = new ChangeRequestCompoundKey(chReqId, SubId, 3);
		System.out.println("created cck"+cck);
		ChangeRequest crObj = new ChangeRequest(cck,32,currentDate, currentDate, currentDate, 56, "gargee", "Banerjee");
		System.out.println("created the crobj"+crObj);
		c.SetChangeRequest(crObj);
			
	}
}
