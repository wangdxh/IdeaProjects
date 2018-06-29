package com.wangdxh.mybatistest.bean;

import java.sql.Date;
import java.sql.Timestamp;

// SELECT column_name FROM information_schema.`COLUMNS` WHERE TABLE_SCHEMA='eds' and TABLE_NAME='VIID'
// 例模式，插入一列
// ^p  ue 替换回车为 ;^p
public class Viid {
    
    private Integer SBBM;
    private String SBMC;
    private String SBCS;
    private String XZQY;
    private Double JD;
    private Double WD;
    private Integer idJSFW;
    private Timestamp AZSJ;
    private Integer LXBCTS;
    private Integer SFSH;
    private Timestamp updatetime;
    private String fromwhere;

    public Integer getSBBM() {
        return SBBM;
    }

    public void setSBBM(Integer SBBM) {
        this.SBBM = SBBM;
    }

    public String getSBMC() {
        return SBMC;
    }

    public void setSBMC(String SBMC) {
        this.SBMC = SBMC;
    }

    public String getSBCS() {
        return SBCS;
    }

    public void setSBCS(String SBCS) {
        this.SBCS = SBCS;
    }

    public String getXZQY() {
        return XZQY;
    }

    public void setXZQY(String XZQY) {
        this.XZQY = XZQY;
    }

    public Double getJD() {
        return JD;
    }

    public void setJD(Double JD) {
        this.JD = JD;
    }

    public Double getWD() {
        return WD;
    }

    public void setWD(Double WD) {
        this.WD = WD;
    }

    public Integer getIdJSFW() {
        return idJSFW;
    }

    public void setIdJSFW(Integer idJSFW) {
        this.idJSFW = idJSFW;
    }

    public Timestamp getAZSJ() {
        return AZSJ;
    }

    public void setAZSJ(Timestamp AZSJ) {
        this.AZSJ = AZSJ;
    }

    public Integer getLXBCTS() {
        return LXBCTS;
    }

    public void setLXBCTS(Integer LXBCTS) {
        this.LXBCTS = LXBCTS;
    }

    public Integer getSFSH() {
        return SFSH;
    }

    public void setSFSH(Integer SFSH) {
        this.SFSH = SFSH;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(String fromwhere) {
        this.fromwhere = fromwhere;
    }
}
