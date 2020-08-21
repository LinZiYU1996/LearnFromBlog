package com.lin.dynamicproxydemo.dynamic_proxy_demo;

import com.lin.dynamicproxydemo.static_proxy_demo.Engineer;
import com.lin.dynamicproxydemo.static_proxy_demo.JavaEngineer;

import java.lang.reflect.Proxy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 16:07
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {
        //有一个美丽的Java工程师，他的名字叫小明。
        Engineer engineer = new JavaEngineer("XiaoMing");

//代理实例的调用处理程序
        ProxyHandler handler = new ProxyHandler(engineer, "老王");

//返回指定接口的代理类实例，该接口可以将方法指派到指定的handler
        Engineer proxy = (Engineer) Proxy.newProxyInstance(Engineer.class.getClassLoader(),
                new Class[]{Engineer.class}, handler);

        proxy.coding();

        System.out.println("------------------输出结果-----------------------");
//老王：整理客户需求中...
//老王：输出需求文档，交给码农去完成!
//XiaoMing :正在努力的coding...
//XiaoMing :终于改完了!
//老王：哎，需求变好多次了.得安抚一下这个码农才好!

    }
}
