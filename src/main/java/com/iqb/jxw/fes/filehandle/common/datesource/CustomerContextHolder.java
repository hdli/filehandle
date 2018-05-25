package com.iqb.jxw.fes.filehandle.common.datesource;

/**
 * Created by hdli on 2018-5-25.
 * 设置数据源

 */
public abstract class CustomerContextHolder {
    public final static String DATA_SOURCE_LOCAL="dataSourceLoacl";
    public final static String DATA_SOURCE_15="dataSource15";

    private static final ThreadLocal<String> contextHolder=new ThreadLocal<String>();

    public static void setCustomerType(String customerType){
        contextHolder.set(customerType);
    }

    public static String getCustomerType(){
        return contextHolder.get();
    }

    public static void clearCustomerType(){
        contextHolder.remove();
    }
}
