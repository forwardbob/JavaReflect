package cn.whitecao.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class TestExtendsAndImpl {
    public static void main(String[] args) throws Exception{
        Class cls=Student.class;
        Constructor constructor = cls.getConstructor(String.class);
        Object o = constructor.newInstance("666");
        //获取实现的接口
        Class[] interfaces = cls.getInterfaces();
        for (Class class1:interfaces){
            System.out.println(class1.getName());
        }
    }
}
