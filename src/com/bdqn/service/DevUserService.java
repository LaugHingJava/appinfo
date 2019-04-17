package com.bdqn.service;

import com.bdqn.pojo.DevUser;

public interface DevUserService {
    public DevUser devUserLogin(String devCode, String devPassword);
}
