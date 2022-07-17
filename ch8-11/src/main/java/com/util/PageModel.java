package com.util;

import java.util.List;

public class PageModel {
    private int pageNo; //当前页数
    private int pageSize=6;   //每页条数
    private int recodeCount;    //总条数
    private  int totalPages;    //总页数

    private List<?> pageData;
    private String likeValue;

    public PageModel() {
    }

    public PageModel(int pageNo, int pageSize, int recodeCount, int totalPages, List<?> pageData, String likeValue) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.recodeCount = recodeCount;
        this.totalPages = totalPages;
        this.pageData = pageData;
        this.likeValue = likeValue;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecodeCount() {
        return recodeCount;
    }

    public void setRecodeCount(int recodeCount) {
        this.recodeCount = recodeCount;
    }

    public int getTotalPages() {
        return (recodeCount%pageSize==0)?(recodeCount/pageSize):((recodeCount/pageSize)+1);
    }

    /*public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }*/
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public List<?> getPageData() {
        return pageData;
    }

    public void setPageData(List<?> pageData) {
        this.pageData = pageData;
    }

    public String getLikeValue() {
        return likeValue;
    }

    public void setLikeValue(String likeValue) {
        this.likeValue = likeValue;
    }
}
