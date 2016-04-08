package annotation;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bar2 {
	
	/*
	 * @Autowired annotation will try to find a bean of type Foo in the spring context and will then inject the same.
	 * If there are more than one beans with same type, then use Qualifier to determine which bean to choose
	 */
	@Autowired
	@Qualifier(value="secondaryFoo")
	private Foo foo;
	
	public Foo getFoo2() {
		return foo2;
	}
	public void setFoo2(Foo foo2) {
		this.foo2 = foo2;
	}
	public Foo getFoo() {
		return foo;
	}
	@Resource(name="foo")
	private Foo foo2;
	
	@Autowired
	private Goo goo;
	
	public Goo getGoo() {
		return goo;
	}
	public void setGoo(Goo goo) {
		this.goo = goo;
	}
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	public void  printFooName(){
		System.out.println(foo.getName());
		System.out.println(foo2.getName());
	}
	
}