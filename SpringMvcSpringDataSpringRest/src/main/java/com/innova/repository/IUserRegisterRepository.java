package com.innova.repository;

import com.innova.entity.UserRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRegisterRepository extends JpaRepository<UserRegisterEntity, Long> {

    UserRegisterEntity findByUserEmail(String userEmail);
}
