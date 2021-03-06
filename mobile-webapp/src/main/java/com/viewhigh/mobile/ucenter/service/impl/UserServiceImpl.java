package com.viewhigh.mobile.ucenter.service.impl;

import com.viewhigh.mobile.ucenter.domain.UserEntity;
import com.viewhigh.mobile.ucenter.repository.UserRepository;
import com.viewhigh.mobile.ucenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity findUserByUsername(String username) {
        return userRepository.findByUsernameIs(username);
    }

    public Page<UserEntity> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
