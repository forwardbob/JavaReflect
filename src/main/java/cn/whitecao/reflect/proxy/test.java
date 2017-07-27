package cn.whitecao.reflect.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
public class test {
    public static void main(String[] args) {
        ChengxuyuanImpl chengxuyuan=new ChengxuyuanImpl();
        Class classes=chengxuyuan.getClass();
        Listener listener=new Listener(chengxuyuan);
        Chengxuyuan cxy = (Chengxuyuan)Proxy.newProxyInstance(classes.getClassLoader(), classes.getInterfaces(), listener);
        System.out.println(cxy);
        cxy.atDongguan();

    }

}
