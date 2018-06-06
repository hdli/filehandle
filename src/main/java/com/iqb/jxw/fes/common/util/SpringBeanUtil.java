package com.iqb.jxw.fes.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hdli on 2018-5-30.
 */
@Component("springBeanUtil")
public class SpringBeanUtil implements ApplicationContextAware {
    private static Logger log = LoggerFactory.getLogger(SpringBeanUtil.class);

    private static ApplicationContext context;

    private static Map<String, Properties> propMap = new HashMap<String, Properties>(
            16);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtil.context=applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public  static <T> T getBean(String prop) {
        Object obj = context.getBean(prop);

        log.debug("property=[" + prop + "],object=[" + obj + "]");

        return (T)obj;
    }

    public static Properties getProperties(String filepath) {
        if (propMap.containsKey(filepath))
            return propMap.get(filepath);

        Resource resource = context.getResource(filepath);
        Properties prop = new Properties();
        try {
            prop.load(resource.getInputStream());
            propMap.put(filepath, prop);
            return prop;
        } catch (IOException e) {
            log.error("can not find the resource file:[" + filepath + "]",e);
            return null;
        }
    }
}
