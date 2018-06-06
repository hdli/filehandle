package com.iqb.jxw.fes.common.datesource;

import com.iqb.jxw.fes.filehandle.controller.FileController;
import org.apache.commons.lang.ClassUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * Created by hdli on 2018-5-25.
 *  1.根据类名动态切换数据源
 *  2.业务拦截处理，
 */
@Component
@Aspect
public class MultipleDataSourceInterceptor {
    private static Logger log = LoggerFactory.getLogger(FileController.class);

    /**
     * 根据类名动态切换数据源
     * @param
     * @throws Exception
     */
    @Pointcut("execution(* com.iqb.jxw.fes.filehandle.service..*(..))")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("======数据源切换开始处理============");
        Class<?> clazz = joinPoint.getTarget().getClass();
        String className = clazz.getName();
        if(ClassUtils.isAssignable(clazz,Proxy.class)){
            className = joinPoint.getSignature().getDeclaringTypeName();
        }
        String methodName = joinPoint.getSignature().getName();
        System.out.println("类名："+className+" , 方法名："+methodName);
        //测试
        Object[] a = joinPoint.getArgs();
        for (Object tr : a){
            System.out.println("请求的参数："+tr.toString());
        }

        if (methodName.contains("Test")){
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_15);
        }else if (methodName.contains("Local")){
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_LOCAL);
        } else {
            CustomerContextHolder.clearCustomerType();
        }
    }
    @AfterThrowing(pointcut = "pointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        log.error("异常类=======:" + joinPoint.getTarget().getClass() + "==" + e.getMessage());
        System.out.println("异常类=======:" + joinPoint.getTarget().getClass() + "==" + e.getMessage());
    }
}
