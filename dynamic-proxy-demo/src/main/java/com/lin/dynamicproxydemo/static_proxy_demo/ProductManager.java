package com.lin.dynamicproxydemo.static_proxy_demo;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/8/20
 * \* Time: 16:03
 * \* Description:
 * \
 */
public class ProductManager implements Engineer{

    private String name;
    private JavaEngineer engineer;

    public ProductManager(JavaEngineer engineer,String name){
        this.engineer = engineer;
        this.name = name;
    }

    public void coding() {
        arrange();
        engineer.coding();
        appease();
    }


    private void arrange(){
        System.out.println(this.name+"：整理客户需求中...");
        System.out.println(this.name+"：输出需求文档，交给码农去完成!");
    }

    private void appease(){
        System.out.println(this.name+"：哎，需求变好多次了.得安抚一下这个码农才好!");
    }


}
