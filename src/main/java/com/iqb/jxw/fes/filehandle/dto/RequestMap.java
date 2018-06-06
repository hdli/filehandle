package com.iqb.jxw.fes.filehandle.dto;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.Serializable;

/**
 * Created by hdli on 2018-6-1.
 */
public class RequestMap implements Serializable {
    private static final long serialVersionUID = 2356910702761795101L;
    //机构号
    private String instCode;
    //产品类型
    private String category;
    //文件类型
    private Integer executeId;
    //请求文件
    private MultipartFile requestfile;
    //结果文件
    private MultipartFile resultfile;
    //请求文件名
    private String requestFileName;
    //结果文件名
    private String resultFileName;

    public RequestMap() {
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getExecuteId() {
        return executeId;
    }

    public void setExecuteId(Integer executeId) {
        this.executeId = executeId;
    }

    public MultipartFile getRequestfile() {
        return requestfile;
    }

    public void setRequestfile(MultipartFile requestfile) {
        this.requestfile = requestfile;
    }

    public MultipartFile getResultfile() {
        return resultfile;
    }

    public void setResultfile(MultipartFile resultfile) {
        this.resultfile = resultfile;
    }

    public String getRequestFileName() {
        if (requestfile != null){
            return requestfile.getOriginalFilename();
        }
        return requestFileName;
    }

    public void setRequestFileName(String requestFileName) {
        this.requestFileName = requestFileName;
    }

    public String getResultFileName() {
        if (resultfile != null){
            return resultfile.getOriginalFilename();
        }
        return resultFileName;
    }

    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }

    @Override
    public String toString() {
        return "RequestMap{" +
                "instCode='" + instCode + '\'' +
                ", category='" + category + '\'' +
                ", executeId=" + executeId +
                ", requestfile=" + requestfile +
                ", resultfile=" + resultfile +
                ", requestFileName='" + requestFileName + '\'' +
                ", resultFileName='" + resultFileName + '\'' +
                '}';
    }
}
