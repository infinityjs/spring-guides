package com.viewhigh.mobile.ucenter.repository;

import com.viewhigh.mobile.ucenter.domain.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUsernameIs(String username);

    Page<UserEntity> findAll(Pageable pageable);

}
