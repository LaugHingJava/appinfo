package com.bdqn.util;

import java.util.List;

public class PageUtil<T>  {

    private int pageSize; //页面容量
    private int totalCount;//总共有多少条记录
    private int currentPageNo; //当前第几页
    private int totalPageCount;//总页数
    public int getStartRow(){
        return (currentPageNo-1)*pageSize; //知道页面容量和当前第几页就可以算出起始行数
    }
    private List<T> list;
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        return "QueryUtil{" +
                "pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", currentPageNo=" + currentPageNo +
                ", totalPageCount=" + totalPageCount +
                ", list=" + list +
                '}';
    }

    public void setPageSize(int pageSize) {
        if(pageSize<0){
            this.pageSize = 5;

        }else{
            this.pageSize = pageSize;
        }
        setTotalPageCount();
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if(totalCount<=0){
            this.totalCount=0;
        }else{
            this.totalCount = totalCount;
        }
    }

    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        if(currentPageNo<=0){
            this.currentPageNo = 1;
        }else if(currentPageNo>=totalPageCount){
            this.currentPageNo = totalPageCount;
        }else{
            this.currentPageNo = currentPageNo;
        }
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount() {
        this.totalPageCount = totalCount%pageSize == 0 ?  totalCount/pageSize:(totalCount/pageSize)+1;
    }


    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
