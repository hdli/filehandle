package com.iqb.jxw.fes.filehandle.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by hdli on 2018-5-25.
 */
public class EnvorimentConfigListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String envStr = System.getenv("res_env_run");
        System.out.println("环境变量res_env_run："+envStr);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
