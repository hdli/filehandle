package com.iqb.jxw.fes.filehandle.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hdli on 2018-5-21.
 */
public class DateTools {

    /** 格式化年月日 yyyyMMdd **/
    private static SimpleDateFormat ymdDf = new SimpleDateFormat("yyyyMMdd");

    /** 格式化年月日 yyyyMMdd **/
    private static SimpleDateFormat ymdDf1 = new SimpleDateFormat("yyyy-MM-dd");

    /** 格式化时分秒 HHmmss **/
    private static SimpleDateFormat hmsDf = new SimpleDateFormat("HHmmss");
    /** 格式化时分秒 HHmmssSSS **/
    private static SimpleDateFormat ymdhmsSDf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    /** 格式化时分秒 yyyy-MM-dd HH:mm:ss **/
    private static SimpleDateFormat ymdhmsSDf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 取当前日期 - yyyyMMdd
     *
     * @return
     */
    public static String getTRXDATE() {
        return ymdDf.format(new Date());
    }

    /**
     * 取昨天的日期 - yyyyMMdd
     *
     * @return
     */
    public static String getYTDDATE() {
        return ymdDf.format(new Date().getTime() - 24*60*60*1000);
    }

    /**
     * 取昨天的日期 - yyyyMMdd
     *
     * @return
     */
    public static String getYTDDATE(Date date) {
        return ymdDf.format(date.getTime() - 24*60*60*1000);
    }

    /**
     * 取昨天的日期 - yyyy-MM-dd
     *
     * @return
     */
    public static String getYTD_DATE(Date date) {
        return ymdDf1.format(date.getTime() - 24*60*60*1000);
    }

    /**
     * 取明天的日期 - yyyyMMdd
     *
     * @return
     */
    public static String getTOMDATE(Date date) {
        return ymdDf.format(date.getTime() + 24*60*60*1000);
    }

    /**
     * 取某个时间的日期 - yyyyMMdd
     */
    public static String getTRXDATE(Date date) {
        return ymdDf.format(date);
    }

    /**
     * 取某个时间的日期 - yyyy-MM-dd
     */
    public static String getTRX_DATE(Date date) {
        return ymdDf1.format(date);
    }

    /**
     * 取当前时分秒 - HHmmss
     *
     * @return
     */
    public static String getTRXTIME() {
        return hmsDf.format(new Date());
    }

    /**
     * 取当前时分秒毫秒 - yyyyMMddHHmmssSSS
     *
     * @return
     */
    public static String getDate() {
        return ymdhmsSDf.format(new Date());
    }

    /**
     * 系统跟踪号的组装
     * @return
     */
    public static String getTracenoStr(){
        return getTRXDATE()+"-"+getTRXTIME();
    }

    /**
     * 获取批量文件名中的日期(T-1)
     * @return
     */
    public static String getBatchFileNameDate(){
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(new Date());//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
        return ymdDf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        System.out.println(getYTD_DATE(new Date()));
    }
}
