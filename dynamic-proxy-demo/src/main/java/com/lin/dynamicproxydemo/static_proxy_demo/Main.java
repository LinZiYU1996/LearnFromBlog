package com.lin.dynamicproxydemo.static_proxy_demo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 16:04
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {
        //有一个美丽的Java工程师，他的名字叫小明。
        JavaEngineer engineer = new JavaEngineer("XiaoMing");

//同样，还有一个猥琐的老王。
        ProductManager manager = new ProductManager(engineer,"老王");

//有新需求的时候，老王负责去沟通搞定。
        manager.coding();

        System.out.println("------------------输出结果-----------------------");
//老王：整理客户需求中...
//老王：输出需求文档，交给码农去完成!
//XiaoMing :正在努力的coding...
//XiaoMing :终于改完了!
//老王：哎，需求变好多次了.得安抚一下这个码农才好!

    }
}
