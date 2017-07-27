package cn.whitecao.reflect.Annotation;

/**
 * Created by 腼腆的老黄 on 2017/7/26.
 */
@Hello(text ="123")
public class Student {
    private String name;
    private String age;
    private String address;


    public String getName() {
        return name;
    }
    @Value(value="笨熊")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    @Value(value="东莞太子酒店")
    @Hello(text = "小笨熊")
    public void setAddress(String address) {
        this.address = address;
    }
}
