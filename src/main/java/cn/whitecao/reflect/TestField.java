package cn.whitecao.reflect;

import cn.whitecao.App;

import java.lang.reflect.Field;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class TestField {
    public static void main(String[] args) throws Exception {
        Class cls=Student.class;
        Object o = cls.newInstance();

        Field field=cls.getField("type");
        field.set(o,"no_type");
        System.out.println(field.get(o));
        //静态属性

        field=cls.getField("sname");
        field.set(null,"上饶毒瓜");
        System.out.println(field.get(null));
    }
}
