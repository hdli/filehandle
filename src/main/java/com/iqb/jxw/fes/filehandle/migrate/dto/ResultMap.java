package com.iqb.jxw.fes.filehandle.migrate.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by hdli on 2018-5-30.
 */
public class ResultMap implements Serializable {

    private static final long serialVersionUID = -8905064255352051588L;

    public static final ResultMap NULL=new ResultMap();
    private int successCount;
    private int failCount;
    private boolean success;
    private Map<String,Serializable> data;
    private List<Map<String,Serializable>> errors;
    private List<String> errorList;
    public int getSuccessCount() {
        return successCount;
    }
    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }
    public int getFailCount() {
        return failCount;
    }
    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }
    public Map<String, Serializable> getData() {
        return data;
    }
    public void setData(Map<String, Serializable> data) {
        this.data = data;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<Map<String, Serializable>> getErrors() {
        return errors;
    }
    public void setErrors(List<Map<String, Serializable>> errors) {
        this.errors = errors;
    }
    public List<String> getErrorList() {
        return errorList;
    }
    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
}
