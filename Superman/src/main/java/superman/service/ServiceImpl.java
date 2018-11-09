package superman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import superman.repo.Scouter;
@Service("serviceImpl")
public class ServiceImpl {
	
	public ServiceImpl(){
		
	}
	
//  public ServiceImpl(Scouter scout, Scouter martial){
//	this.scout=scout;
//	this.martial=martial;
//		
//}
	@Autowired
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
