package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class SpringBean {
	
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBean.class);

	
	public SpringBean() {
		logger.info("Crea 1 instancia de SpringBean: " + this.hashCode());
	}

}
