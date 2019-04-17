package com.bdqn.service;

import com.bdqn.pojo.AppInfo;
import com.bdqn.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoService {
    public int findAppInfoCount(
            String softwareName, Integer status,
            Integer flatformId, Integer queryCategoryLevel1,
            Integer queryCategoryLevel2, Integer queryCategoryLevel3,
            Integer devId
    );
    public PageUtil findAppInfoList(String softwareName, Integer status,
                                    Integer flatformId, Integer queryCategoryLevel1,
                                    Integer queryCategoryLevel2, Integer queryCategoryLevel3,
                                    Integer devId, Integer currentPageNo, Integer pageSize);
}
