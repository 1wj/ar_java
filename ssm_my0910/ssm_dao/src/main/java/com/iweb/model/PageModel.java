package com.iweb.model;

import java.util.List;

public class PageModel<T> {
    private List<T> uList;
    private int pageSize=4; //每页分多少数据
   // private int pageNo; //当前页数  不需要了
    private int recodeCount; //总条数
    private int totalSize;  //总页数
    private int pageIndex;//当前页

    public int getPageIndex() {
       this.pageIndex=this.pageIndex<=0?1:this.pageIndex;
       return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }


    public int getRecodeCount() {
       this.recodeCount=this.recodeCount<=0?0:this.recodeCount;
       return recodeCount;
    }

    public void setRecodeCount(int recodeCount) {
        this.recodeCount = recodeCount;
    }

    public List<T> getuList() {
        return uList;
    }

    public void setuList(List<T> uList) {
        this.uList = uList;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize() {
        this.totalSize =(recodeCount % pageSize == 0) ?(recodeCount / pageSize) : (recodeCount / pageSize +1);
    }
}
