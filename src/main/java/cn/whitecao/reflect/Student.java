package cn.whitecao.reflect;

import java.io.Serializable;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class Student implements Serializable {
    private String name;
    private int age;

    public static String sname="";
    public String type;
    public static String staticMM(String name){
        System.out.println("静态方法:"+name);
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(String name, int age){
        this.name=name;
        this.age=age;

    }
    public Student(String name) {
        this.name = name;
        System.out.println("构造器启动");
    }

    public Student() {
        System.out.println("无参方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
