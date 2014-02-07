package huadi.designpattern.proxy;

public class StaticProxyTarget implements IStaticProxy {

    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }

}
