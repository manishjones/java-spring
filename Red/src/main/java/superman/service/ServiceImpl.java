package superman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import superman.repo.Scouter;
@Service("serviceImpl")
@Scope("singleton")
public class ServiceImpl {
	
	public ServiceImpl(){
		
	}
	
	@Autowired
 public ServiceImpl(Scouter scout){
	 System.out.println("the constructor is used for creating the instance");
	 this.scout=scout;
	//this.martial=martial;
		
}
	@Autowired
	public Scouter scout;
	public Integer martial;
	
	

	@Autowired
	public void setScout(Scouter scout) {
		System.out.println("setter method has been used");
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
