package com.clp.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/5/3.
 */
public class Movie {

    private int id;
    private String movieName;
    private String price;
    private String moiveAddress;
    private Date   releasedDate;
    private String remark;

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMoiveAddress() {
        return moiveAddress;
    }

    public void setMoiveAddress(String moiveAddress) {
        this.moiveAddress = moiveAddress;
    }




}
