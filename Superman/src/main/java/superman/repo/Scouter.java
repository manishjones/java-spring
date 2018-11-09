package superman.repo;

import org.springframework.stereotype.Repository;

import superman.com.Element;

@Repository("scout")
public class Scouter {
	
	public Element getElement(){
		Element worldclass=new Element();
		return worldclass ;
		
	}
	
	
	public void ElementPrinter(){
		Element wc= this.getElement();
		wc.setGame("The beautiful Game");
		wc.setExp(8);
		wc.setSkill("Stepovers");
		wc.setAdroit(true);
		
		System.out.println(wc.getGame()+wc.getSkill()+wc.getExp()+wc.getAdroit());
		System.out.println("done--------------------------------------------------done");
	}
 

}
