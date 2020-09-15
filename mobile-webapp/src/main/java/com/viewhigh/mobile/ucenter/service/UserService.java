package com.viewhigh.mobile.ucenter.service;


import com.viewhigh.mobile.ucenter.domain.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserEntity findUserByUsername(String username);

    Page<UserEntity> findAll(Pageable pageable);
}
