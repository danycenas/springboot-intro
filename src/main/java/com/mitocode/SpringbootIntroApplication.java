package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import pe.peru.OtroSpringBean;

@ComponentScans({ 
	@ComponentScan("com.mitocode"), 
	@ComponentScan("pe.peru")
})

@SpringBootApplication
public class SpringbootIntroApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootIntroApplication.class);

	@Autowired
	private SpringBean springBean;

	@Autowired
	private OtroSpringBean otroSpringBean;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Aplicacion iniciada!");

		logger.info("SpringBean con hash: " + springBean.hashCode());
		logger.info("OtroSpringBean con hash: " + otroSpringBean.hashCode());

//		SpringBean instancia = new SpringBean();
//		logger.info("Nueva instancia " + instancia.hashCode());
	}

}
