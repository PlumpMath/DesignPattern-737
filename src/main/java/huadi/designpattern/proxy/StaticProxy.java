package huadi.designpattern.proxy;

public class StaticProxy implements IStaticProxy {
    /** 代理的目标 */
    private StaticProxyTarget target;

    public StaticProxy(StaticProxyTarget target) {
        this.target = target;
    }

    @Override
    public void sayHello() {
        System.out.println("Befor say hello.");
        this.target.sayHello();
        System.out.println("After say hello.");
    }

}
