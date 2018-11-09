package superman.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import superman.service.ServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=  new AnnotationConfigApplicationContext(AppConfig.class);
	
		ServiceImpl si= ac.getBean("serviceImpl",ServiceImpl.class);
		//si.setScout(new Scouter());
		si.elementprinter();
		
		
		
	}
}
