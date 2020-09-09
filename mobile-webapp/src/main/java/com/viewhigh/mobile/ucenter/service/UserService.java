package com.viewhigh.mobile.ucenter.service;


import com.viewhigh.mobile.ucenter.domain.UserEntity;

public interface UserService {

    public UserEntity findUserByUsername(String username);

}
