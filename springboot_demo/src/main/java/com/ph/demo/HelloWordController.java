package com.ph.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ydr.sysid.MySystemInfo;

@RestController
public class HelloWordController {
	@Autowired
	private Environment environment;
	
	@RequestMapping("/info")
	   public String info(){
		 return "My SystemID is:</br>"
				 +MySystemInfo.getMyID(environment.getProperty("name"),environment.getProperty("number"));
		 
	}

}
