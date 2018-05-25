package com.iqb.jxw.fes.filehandle.entity;

import java.util.Date;

public class MigrateFile {
    private Long sid;

    private String instcode;

    private String filename;

    private Integer finalcounts;

    private String state;

    private Date tims;

    private String code;

    private String type;

    private Date createtims;

    private Integer io;

    private Integer executeid;

    private Long version;

    private Date endtime;

    private String category;

    private Integer succounts;

    private Integer failcounts;

    private String filerspname;

    private Integer upOss;

    private Integer migratetype;

    private String reason;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getInstcode() {
        return instcode;
    }

    public void setInstcode(String instcode) {
        this.instcode = instcode == null ? null : instcode.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getFinalcounts() {
        return finalcounts;
    }

    public void setFinalcounts(Integer finalcounts) {
        this.finalcounts = finalcounts;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getTims() {
        return tims;
    }

    public void setTims(Date tims) {
        this.tims = tims;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreatetims() {
        return createtims;
    }

    public void setCreatetims(Date createtims) {
        this.createtims = createtims;
    }

    public Integer getIo() {
        return io;
    }

    public void setIo(Integer io) {
        this.io = io;
    }

    public Integer getExecuteid() {
        return executeid;
    }

    public void setExecuteid(Integer executeid) {
        this.executeid = executeid;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getSuccounts() {
        return succounts;
    }

    public void setSuccounts(Integer succounts) {
        this.succounts = succounts;
    }

    public Integer getFailcounts() {
        return failcounts;
    }

    public void setFailcounts(Integer failcounts) {
        this.failcounts = failcounts;
    }

    public String getFilerspname() {
        return filerspname;
    }

    public void setFilerspname(String filerspname) {
        this.filerspname = filerspname == null ? null : filerspname.trim();
    }

    public Integer getUpOss() {
        return upOss;
    }

    public void setUpOss(Integer upOss) {
        this.upOss = upOss;
    }

    public Integer getMigratetype() {
        return migratetype;
    }

    public void setMigratetype(Integer migratetype) {
        this.migratetype = migratetype;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}