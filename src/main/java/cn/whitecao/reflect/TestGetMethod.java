package cn.whitecao.reflect;

import java.lang.reflect.Method;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class TestGetMethod {
    public static void main(String[] args) throws Exception{
        Class csStudent=Student.class;
        //构建对象
        Object obj=csStudent.newInstance();
        //csStudent.getMethod();获得此类的所有方法
        Method method=csStudent.getMethod("setName", String.class);
        //调用方法,静态方法第一个参数传null;
        method.invoke(obj,"尼古拉斯 小瓜");
//        Student student=(Student)obj;
//        System.out.println(student.getName());
        method=csStudent.getMethod("getName");
        String name=(String)method.invoke(obj);
        System.out.println(name);

        method=csStudent.getMethod("staticMM", String.class);
        method.invoke(null,"666");
    }
}
