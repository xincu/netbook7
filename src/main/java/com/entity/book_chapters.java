package com.entity;

public class book_chapters {
    private Integer bcId;

    private Integer bId;

    private Integer cNum;

    private String cName;

    private Integer bWid;

    private Integer bcStateId;

    private String cContent;

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getbWid() {
        return bWid;
    }

    public void setbWid(Integer bWid) {
        this.bWid = bWid;
    }

    public Integer getBcStateId() {
        return bcStateId;
    }

    public void setBcStateId(Integer bcStateId) {
        this.bcStateId = bcStateId;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }
}