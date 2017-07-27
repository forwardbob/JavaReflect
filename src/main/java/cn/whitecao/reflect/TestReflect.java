package cn.whitecao.reflect;

import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class TestReflect {
    public static String name;
    public int age;
    private String pwd;
    public TestReflect(int sb) {

    }
    public TestReflect(String sb,int age) {
        this.age=age;

    }
    public TestReflect(Class sb) {

    }
    public void hello(Exception e)throws FileNotFoundException{

    }
    public static void main(String[] args) {
        Class cls=TestReflect.class;

        //获取类的构造方法
        Constructor[] constructors=cls.getConstructors();
        for (Constructor constructor:constructors){
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType:parameterTypes){
                System.out.println(parameterType);
            }
        }

        //获得类的属性
//        Field[] fields = cls.getFields();
//        for (Field field:fields) {
//            System.out.println(field);
//        }

//        Method[] methods=cls.getMethods();
//        for (Method method:methods){
//            System.out.println(method.getName());
//            //获取参数类型
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class cl:parameterTypes){
//                System.out.println(cl.getName());
//            }
//            System.out.println("返回值是:"+method.getReturnType().getName());
//            //获得抛出异常信息
//            Type[] types = method.getGenericExceptionTypes();
//            for(Type type:types){
//                System.out.println("抛出异常类型"+type.getTypeName());
//            }
//            System.out.println("----------------------------------------");
//        }
    }
}
