package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repo.Scouter;
import service.ServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=  new ClassPathXmlApplicationContext("NewFile.xml");
		ServiceImpl si= ac.getBean("sup",ServiceImpl.class);
		//si.setScout(new Scouter());
		si.elementprinter();
		
		
		
	}
}
