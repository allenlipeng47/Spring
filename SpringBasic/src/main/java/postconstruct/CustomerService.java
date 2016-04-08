package postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {
	String message;
	
	public CustomerService(){
		System.out.println("in customerService constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * @PostConstruct runs after the constructor method.
	 */
	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Customer clean up");
	}

}