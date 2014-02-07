package huadi.designpattern.proxy;

/**
 * 代理模式
 * 
 * @author Huadi
 */
public class Proxy {

    public void StaticProxy() {
        IStaticProxy proxy = new StaticProxy(new StaticProxyTarget());
        proxy.sayHello();
    }

    public void DynamicProxy() {
        DynamicProxy proxy = new DynamicProxy();
        IDynamicProxy proxyTarget = (IDynamicProxy) proxy
                .bind(new DynamicProxyTarget());
        proxyTarget.sayHello();
    }

    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.StaticProxy();
        p.DynamicProxy();
    }
}
