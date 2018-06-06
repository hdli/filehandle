package com.iqb.jxw.fes.filehandle.migrate.job;

import com.iqb.jxw.fes.common.util.SpringBeanUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hdli on 2018-5-30.
 */
public class MigratefileJobFactory implements ApplicationListener<ContextRefreshedEvent> {

    private static MigratefileJobFactory instance=new MigratefileJobFactory();
    private static Map<Integer,MigratefileJob> cache=new HashMap<Integer,MigratefileJob>();
    public static MigratefileJobFactory get(){
        return instance;
    }
    public static MigratefileJob create(Integer key){
        return cache.get(key);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent() == null){
            ApplicationContext context = SpringBeanUtil.getApplicationContext();
            if(context == null){
                System.out.println("context is null");
            }else {
                Map<String,MigratefileJob> jobs= context.getBeansOfType(MigratefileJob.class);
                for(Map.Entry<String,MigratefileJob> job:jobs.entrySet()){
                    cache.put(job.getValue().getKey(),job.getValue());
                }
            }
        }
    }
}
