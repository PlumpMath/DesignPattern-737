package huadi.designpattern.proxy;

public class DynamicProxyTarget implements IDynamicProxy {

	@Override
	public void sayHello() {
		System.out.println("Hello, world!");
	}

}
