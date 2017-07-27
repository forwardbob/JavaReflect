package cn.whitecao.reflect.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Hello {
    public String text();
    public String hhh() default "大笨熊";
}
