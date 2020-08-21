package com.lin.dynamicproxydemo.static_proxy_demo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 16:03
 * \* Description:
 * \
 */
public class JavaEngineer implements Engineer{

    private String name;

    public JavaEngineer(String name){
        this.name = name;
    }

    public void coding() {

        System.out.println(name+" :正在努力的coding...");
        System.out.println(name+" :终于改完了!");
    }


}
