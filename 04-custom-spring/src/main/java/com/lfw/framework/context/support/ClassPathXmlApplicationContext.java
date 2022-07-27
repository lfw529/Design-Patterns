package com.lfw.framework.context.support;

import com.lfw.framework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @version v1.0
 * @ClassName: ClassPathXmlApplicationContext
 * @Description: IOC容器具体的子实现类
 * 用于加载类路径下的xml格式的配置文件
 * @Author: 黑马程序员
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        return null;
    }
}
