package com.lin.dynamicproxydemo.my;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 22:28
 * \* Description:
 * \
 */
public class ServiceImpl implements Service{

    @Override
    public void doSomething(String name) {
        System.out.println(name);
    }
}
