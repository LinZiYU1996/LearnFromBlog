package com.lin.dynamicproxydemo.my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 22:30
 * \* Description:
 * \
 */
public class ProxyBean implements InvocationHandler {


    private Object target;

    private String name;

    public ProxyBean(Object target, String name) {
        this.target = target;
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(target, args);
        after();
        return proxy;
    }

    private void before() {
        System.out.println(" before ................");
    }

    private void after() {
        System.out.println("after ..........................");
    }
}
