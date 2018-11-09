package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Batman.xml");
		ServiceImpl serv=ac.getBean("serviceImpl", ServiceImpl.class);
		System.out.println(serv.profile().get(0).getName());
		System.out.println(serv.profile().get(0).getCountry());
		System.out.println(serv.profile().get(0).getClub());
	}

}
