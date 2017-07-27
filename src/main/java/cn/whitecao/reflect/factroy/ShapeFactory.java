package cn.whitecao.reflect.factroy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by 腼腆的老黄 on 2017/7/4.
 */
public class ShapeFactory {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(new FileInputStream("a.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Shape getShape(String shapeType)throws Exception {
        String className = properties.getProperty(shapeType);
        return (Shape) Class.forName(className).newInstance();

    }
}
