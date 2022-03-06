package com.webservice.team1grpbws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MController {
	@RequestMapping("show")
	
	public String show() {
		/*
		 * the tomcat-embed-jasper dependency to allow our application 
		 * to compile and render JSP pages
		 */
		return "data.jsp";

	}

}
