package ${groupId};

import org.springframework.boot.SpringApplication;
import es.um.CorreApplication;


public class MicroserviceMainApplication extends CorreApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MsMainApplication.class, args);
	}

}
