package com.viewhigh.mobile.ucenter.service.impl;

import com.viewhigh.mobile.ucenter.domain.UserEntity;
import com.viewhigh.mobile.ucenter.repository.UserRepository;
import com.viewhigh.mobile.ucenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity findUserByUsername(String username) {
        return userRepository.findByUsernameIs(username);
    }
}
