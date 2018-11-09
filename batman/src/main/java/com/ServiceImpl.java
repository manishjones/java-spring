package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceImpl")
public class ServiceImpl {
	
	private Scout scout;
	
	public void setScout(Scout scout){
		this.scout=scout;
	}
	@Autowired
	public ServiceImpl(Scout scout){
		this.scout=scout;
		
	}
	
	public List<Player> profile(){
		return scout.profile();
	}

}
