package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		"annotation/annotation.xml");
		Bar2 bar2 = applicationContext.getBean(Bar2.class);
		System.out.println(bar2.getFoo().getName());
		System.out.println(bar2.getGoo().getName());
		Goo goo  = applicationContext.getBean(Goo.class);
		System.out.println(goo.getName());
	}

}
