package com.bdqn.service.impl;

import com.bdqn.dao.DevUserMapper;
import com.bdqn.pojo.DevUser;
import com.bdqn.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper devUserMapper;
    public DevUser devUserLogin(String devCode,String devPassword){
        return devUserMapper.devUserLogin(devCode,devPassword);
    }
}
