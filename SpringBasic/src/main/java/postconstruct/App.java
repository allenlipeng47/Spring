package postconstruct;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import postconstruct.CustomerService;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "postconstruct/spring-config.xml" });

		CustomerService cust = (CustomerService) context
				.getBean("customerService");

//		System.out.println(cust.getMessage());

		context.close();
	}

}
