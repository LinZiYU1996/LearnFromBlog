package com.lin.dynamicproxydemo.dynamic_proxy_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 16:06
 * \* Description:
 * JDK通过反射机制给我们提供了动态代理的实现，允许开发人员在运行时刻动态的创建出代理类及其对象。
 * 当使用者调用了代理对象所代理的接口中的方法的时候，这个调用的信息会被传递给InvocationHandler的invoke方法。
 * 在 invoke方法的参数中可以获取到代理对象、方法对应的Method对象和调用的实际参数。invoke方法的返回值被返回给使用者。
 * 这种做法实际上相当于对方法调用进行了拦截。
 * 关键有两个类，Proxy和InvocationHandler   。
 *
 * Proxy 用于生成代理类
 * InvocationHandler  用于调用目标类的方法，并且允许在调用前后插入其他的逻辑
 *
 *
 *
 * \
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;
    private String name;

    public ProxyHandler(Object target,String name){
        this.target = target;
        this.name = name;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        arrange();
        method.invoke(target, args);
        appease();
        return null;
    }




    private void arrange(){
        System.out.println(this.name+"：整理客户需求中...");
        System.out.println(this.name+"：输出需求文档，交给工程师去完成!");
    }

    private void appease(){
        System.out.println(this.name+"：哎，需求变好多次了.得安抚一下这个码农才好!");
    }
}

