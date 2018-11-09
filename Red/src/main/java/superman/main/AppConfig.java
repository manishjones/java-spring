package superman.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("superman")
public class AppConfig {
	
//	@Bean(name="serviceImpl")
//	public ServiceImpl getServiceImpl(){
//		ServiceImpl sev=new ServiceImpl(getScouter());
//		//sev.setScout(this.getScouter());
//		return sev;
//	}
//	
//	@Bean(name="scout")
//	public Scouter getScouter(){
//		return new Scouter();
//	}

}
