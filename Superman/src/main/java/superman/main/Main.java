package superman.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import superman.repo.Scouter;
import superman.service.ServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=  new ClassPathXmlApplicationContext("NewFile.xml");
		ServiceImpl si= ac.getBean("serviceImpl",ServiceImpl.class);
		//si.setScout(new Scouter());
		si.elementprinter();
		
		
		
	}
}
