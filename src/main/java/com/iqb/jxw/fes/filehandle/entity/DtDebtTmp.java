package com.iqb.jxw.fes.filehandle.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DtDebtTmp {
    private Long sid;

    private String instcode;

    private String acctno;

    private String custno;

    private String productid;

    private String raisedate;

    private String raiseenddate;

    private String inttype;

    private String intpayday;

    private Short duration;

    private BigDecimal debtamount;

    private BigDecimal debtrate;

    private String state;

    private String proddesc;

    private String bailacctno;

    private String bailaccountid;

    private String nominalaccountid;

    private String receiptaccountid;

    private String intdate;

    private Date tims;

    private String accountid;

    private Long fid;

    private Integer rank;

    private String fromproductid;

    private Long flag;

    private Long version;

    private String rspcode;

    private Integer ischange;

    private String filerspname;

    private String mborrowflag;

    private String entrustflag;

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

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno == null ? null : acctno.trim();
    }

    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno == null ? null : custno.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getRaisedate() {
        return raisedate;
    }

    public void setRaisedate(String raisedate) {
        this.raisedate = raisedate == null ? null : raisedate.trim();
    }

    public String getRaiseenddate() {
        return raiseenddate;
    }

    public void setRaiseenddate(String raiseenddate) {
        this.raiseenddate = raiseenddate == null ? null : raiseenddate.trim();
    }

    public String getInttype() {
        return inttype;
    }

    public void setInttype(String inttype) {
        this.inttype = inttype == null ? null : inttype.trim();
    }

    public String getIntpayday() {
        return intpayday;
    }

    public void setIntpayday(String intpayday) {
        this.intpayday = intpayday == null ? null : intpayday.trim();
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public BigDecimal getDebtamount() {
        return debtamount;
    }

    public void setDebtamount(BigDecimal debtamount) {
        this.debtamount = debtamount;
    }

    public BigDecimal getDebtrate() {
        return debtrate;
    }

    public void setDebtrate(BigDecimal debtrate) {
        this.debtrate = debtrate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProddesc() {
        return proddesc;
    }

    public void setProddesc(String proddesc) {
        this.proddesc = proddesc == null ? null : proddesc.trim();
    }

    public String getBailacctno() {
        return bailacctno;
    }

    public void setBailacctno(String bailacctno) {
        this.bailacctno = bailacctno == null ? null : bailacctno.trim();
    }

    public String getBailaccountid() {
        return bailaccountid;
    }

    public void setBailaccountid(String bailaccountid) {
        this.bailaccountid = bailaccountid == null ? null : bailaccountid.trim();
    }

    public String getNominalaccountid() {
        return nominalaccountid;
    }

    public void setNominalaccountid(String nominalaccountid) {
        this.nominalaccountid = nominalaccountid == null ? null : nominalaccountid.trim();
    }

    public String getReceiptaccountid() {
        return receiptaccountid;
    }

    public void setReceiptaccountid(String receiptaccountid) {
        this.receiptaccountid = receiptaccountid == null ? null : receiptaccountid.trim();
    }

    public String getIntdate() {
        return intdate;
    }

    public void setIntdate(String intdate) {
        this.intdate = intdate == null ? null : intdate.trim();
    }

    public Date getTims() {
        return tims;
    }

    public void setTims(Date tims) {
        this.tims = tims;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFromproductid() {
        return fromproductid;
    }

    public void setFromproductid(String fromproductid) {
        this.fromproductid = fromproductid == null ? null : fromproductid.trim();
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getRspcode() {
        return rspcode;
    }

    public void setRspcode(String rspcode) {
        this.rspcode = rspcode == null ? null : rspcode.trim();
    }

    public Integer getIschange() {
        return ischange;
    }

    public void setIschange(Integer ischange) {
        this.ischange = ischange;
    }

    public String getFilerspname() {
        return filerspname;
    }

    public void setFilerspname(String filerspname) {
        this.filerspname = filerspname == null ? null : filerspname.trim();
    }

    public String getMborrowflag() {
        return mborrowflag;
    }

    public void setMborrowflag(String mborrowflag) {
        this.mborrowflag = mborrowflag == null ? null : mborrowflag.trim();
    }

    public String getEntrustflag() {
        return entrustflag;
    }

    public void setEntrustflag(String entrustflag) {
        this.entrustflag = entrustflag == null ? null : entrustflag.trim();
    }
}