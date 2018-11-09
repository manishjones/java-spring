package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("scout")
public class Scout {
	
	public List<Player> profile(){
		List<Player> uno= new ArrayList<>();
		Player one=new Player("Mesut Ozil","Germany","Arsenal");
		uno.add(one);
		return uno;
	}

}
