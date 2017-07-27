package cn.whitecao.reflect.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */

public class Test {

    public static void main(String[] args)throws Exception {
        Class cls = Student.class;
        Object o = cls.newInstance();
        //遍历类的注解
        Annotation[] clsAnnotations = cls.getAnnotations();
        for (Annotation a:clsAnnotations) {
            System.out.println(a.annotationType());
        }

        System.out.println("---------------------------------------------");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.println(annotation.annotationType());
                    if (annotation instanceof Value) {
                        Value value=(Value) annotation;
                        System.out.println(value.value());
                        method.invoke(o,value.value());
                    }
                }
                System.out.println(method.getName());
            }
        }
        Student student=(Student)o;
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}
