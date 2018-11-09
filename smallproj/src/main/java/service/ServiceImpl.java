package service;

import repo.Scouter;
import java.lang.Package;

public class ServiceImpl {
	
	public ServiceImpl(){
		
	}
	
//  public ServiceImpl(Scouter scout, Scouter martial){
//	this.scout=scout;
//	this.martial=martial;
//		
//}

	public Scouter scout;
	public Integer martial;
	
	

	
	public void setScout(Scouter scout) {
		this.scout = scout;
		//this.martial=martial;
	}

	public void setMartial(Integer martial){
		this.martial=martial;
	}
	


	public void elementprinter(){
		scout.ElementPrinter();
		System.out.println(martial);
	}

}
