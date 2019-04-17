package com.bdqn.dao;

import com.bdqn.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserMapper {
    public DevUser devUserLogin(@Param("devCode")String devCode,@Param("devPassword") String password);
}
