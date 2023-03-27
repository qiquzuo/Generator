package com.example.generator.model;

import java.math.BigDecimal;

public class score {
    private String sno;

    private String cno;

    private BigDecimal degree;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public BigDecimal getDegree() {
        return degree;
    }

    public void setDegree(BigDecimal degree) {
        this.degree = degree;
    }
}