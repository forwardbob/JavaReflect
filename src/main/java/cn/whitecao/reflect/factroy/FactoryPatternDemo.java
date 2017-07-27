package cn.whitecao.reflect.factroy;

/**
 * Created by 腼腆的老黄 on 2017/7/4.
 */
public class FactoryPatternDemo {
    public static void main(String[] args)throws Exception {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
