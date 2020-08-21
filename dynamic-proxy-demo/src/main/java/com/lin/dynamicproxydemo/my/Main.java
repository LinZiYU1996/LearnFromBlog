package com.lin.dynamicproxydemo.my;

import java.lang.reflect.Proxy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 22:32
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Service service = new ServiceImpl();

        ProxyBean proxyBean = new ProxyBean(service, "a");

        Service proxyservice = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                proxyBean
        );

        proxyservice.doSomething("aaa");





    }
}
