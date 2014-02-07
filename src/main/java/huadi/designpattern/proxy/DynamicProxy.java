package huadi.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private DynamicProxyTarget target;

    public Object bind(DynamicProxyTarget target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("Dynamic before invoke");
        Object result = method.invoke(this.target, args);
        System.out.println("Dynamic after invoke");
        return result;
    }

}
