package pe.peru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OtroSpringBean {

	private static final Logger logger = LoggerFactory.getLogger(OtroSpringBean.class);

	public OtroSpringBean() {
		logger.info("Crea 1 instancia de OtroSpringBean : " + this.hashCode());
	}
}
