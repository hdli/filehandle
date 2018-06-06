package com.iqb.jxw.fes.filehandle.dto;

import java.io.Serializable;

/**
 * Created by hdli on 2018-6-1.
 */
public class AjaxResponse<T> implements Serializable {

    private static final long serialVersionUID = -6967578252327273384L;

    private T data;
    private int itemsCount;
    private boolean success;
    private String retCode;
    private String retMsg;

    public AjaxResponse(T data,boolean success){
        this.data=data;
        this.success=success;
    }
    public AjaxResponse(T data,int itemsCount,boolean success){
        this.data=data;
        this.success=success;
        this.itemsCount=itemsCount;
    }
    public AjaxResponse(String retCode,String retMsg){
        this.retCode=retCode;
        this.retMsg=retMsg;
    }
    public AjaxResponse(String retMsg){
        this.retCode=retMsg;
        this.retMsg=retMsg;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getRetCode() {
        return retCode;
    }
    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
    public String getRetMsg() {
        return retMsg;
    }
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
    public T getData() {
        return data;
    }
    public int getItemsCount() {
        return itemsCount;
    }
}
