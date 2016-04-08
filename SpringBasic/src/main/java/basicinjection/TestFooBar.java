package basicinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFooBar {
 
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"basicinjection/springbasic.xml");
		Bar bar = (Bar)applicationContext.getBean("bar", Bar.class);
		bar.processFooName();
		System.out.println(bar.toString());
		/*
		 * if a single definition of a class type exists, then u can get the
		 * instance by this way also. No need to specify Id
		 */
		Foo foo = (Foo)applicationContext.getBean(Foo.class);
		System.out.println(foo.getName());
	}
 
}