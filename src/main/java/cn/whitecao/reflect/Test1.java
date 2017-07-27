package cn.whitecao.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class Test1 {
    public static void main(String[] args)throws Exception {
        Class csStudent=Student.class;
        //csStudent.newInstance();//只会调用无参构造
        //得到Student的构造器
        Constructor[] constructors=csStudent.getConstructors();
        //用参数来搜索构造器
        Constructor constructor=csStudent.getConstructor(String.class,int.class);

        Object object=constructor.newInstance("叼毛",1);
        Student s=(Student)object;
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
