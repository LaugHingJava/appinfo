package com.bdqn.service.impl;

import com.bdqn.dao.AppInfoMapper;
import com.bdqn.pojo.AppInfo;
import com.bdqn.service.AppInfoService;
import com.bdqn.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public int findAppInfoCount(String softwareName, Integer status, Integer flatformId, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer devId) {
        return  appInfoMapper.findAppInfoCount(softwareName,status,flatformId,queryCategoryLevel1,queryCategoryLevel2,queryCategoryLevel3,devId);
    }

    @Override
    public PageUtil findAppInfoList(String softwareName, Integer status, Integer flatformId, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer devId, Integer currentPageNo, Integer pageSize) {
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotalCount(findAppInfoCount(softwareName,status,flatformId,queryCategoryLevel1,queryCategoryLevel2,queryCategoryLevel3,devId));
        if(pageUtil.getTotalCount()==0){
            return null;
        }
        pageUtil.setPageSize(pageSize);
        pageUtil.setCurrentPageNo(currentPageNo);
        pageUtil.setList(appInfoMapper.findAppInfoList(softwareName,status,flatformId,queryCategoryLevel1,queryCategoryLevel2,queryCategoryLevel3,devId,pageUtil.getStartRow(),pageUtil.getPageSize()));
        return pageUtil;
    }
}
