package com.bdqn.dao;

import com.bdqn.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    /**APP基础信息查询
     * @param softwareName
     * @param status
     * @param flatformId
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param devId
     * @param StartRow
     * @param pageSize
     * @return
     */
    public List<AppInfo>  findAppInfoList(
            @Param("softwareName")String softwareName,@Param("status") Integer status,
            @Param("flatformId")Integer flatformId, @Param(value="categoryLevel1")Integer queryCategoryLevel1,
            @Param(value="categoryLevel2")Integer queryCategoryLevel2, @Param(value="categoryLevel3")Integer queryCategoryLevel3,
            @Param("devId") Integer devId,@Param("startRow") Integer StartRow,@Param("pageSize") Integer pageSize
    );

    /**APP基础信息查询数量
     * @param softwareName
     * @param status
     * @param flatformId
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param devId
     * @return
     */
    public int findAppInfoCount(
            @Param("softwareName")String softwareName,@Param("status") Integer status,
            @Param("flatformId")Integer flatformId, @Param(value="categoryLevel1")Integer queryCategoryLevel1,
            @Param(value="categoryLevel2")Integer queryCategoryLevel2, @Param(value="categoryLevel3")Integer queryCategoryLevel3,
            @Param("devId") Integer devId
    );

}
